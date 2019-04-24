package testMethods.acLib;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import xoc.dta.TestMethod;
import xoc.dta.UncheckedDTAException;
import xoc.dta.annotations.In;
import xoc.dta.datatypes.MultiSiteBoolean;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IDigInOutCaptureResults;
import xoc.dta.resultaccess.datatypes.MultiSiteBitSequence;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/**
 * This is a basic test method that executes a functional test.
 * It runs a digital pattern or an operating sequence.
 * It retrieves results of digital capture.
 *
 */
public class DigitalCaptureTest extends TestMethod {

    /** Main object for the test execution */
    public IMeasurement measurement;
    /** Functional test descriptor for datalog */
    public IFunctionalTestDescriptor myFtd;
    /** digInOut signals to be captured from */
    @In public String testSignals = "allOutputs";
    /** Parameter to enable releaseTester to allow background post-processing */
    @In public Boolean enableReleaseTester = true;

    @Override
    public void setup() {
        // Check, if a pattern/operating sequence is executed
        if (measurement.getPatternName() == null
                && measurement.getOperatingSequenceName() == null) {
            throw new UncheckedDTAException("[" + this.getClass().getName() + ": line "
                    + new Exception().getStackTrace()[0].getLineNumber() + "] Test suite '"
                    + context.getTestSuiteName()
                    + "' requires setting of pattern or operating sequence.");
        }
        // Check, if test signals are valid
        if (testSignals.trim().isEmpty()) {
            throw new UncheckedDTAException("[" + this.getClass().getName() + ": line "
                    + new Exception().getStackTrace()[0].getLineNumber()
                    + "] Input parameter 'testSignals' (value '" + testSignals
                    + "' ) is empty in test suite '" + context.getTestSuiteName() + "'.");
        }
    }

    @Override
    public void update() {
        // Check, if all test signals are configured for capture for all sites
        Map<String, MultiSiteBoolean> getCaptureEnabledAllSignals = measurement
                .digInOut(testSignals).result().capture().getEnabledPerSignal();
        for (Entry<String, MultiSiteBoolean> getCaptureEnabledSingleSignal : getCaptureEnabledAllSignals
                .entrySet()) {
            for (int site : context.getActiveSites()) {
                if (!(getCaptureEnabledSingleSignal.getValue().get(site))) {
                    throw new UncheckedDTAException("[" + this.getClass().getName() + ": line "
                            + new Exception().getStackTrace()[0].getLineNumber()
                            + "] Input parameter 'testSignals' (Value: '" + testSignals
                            + "'): Signal '" + getCaptureEnabledSingleSignal.getKey()
                            + "' is not configured for 'capture' in test suite '"
                            + context.getTestSuiteName() + "'.");
                }
            }
        }
    }

    @Override
    public void execute() {

        // run measurement
        measurement.execute();

        // protect results
        IDigInOutCaptureResults digCapture = measurement.digInOut(testSignals)
                .preserveCaptureResults();

        // next test suite can start and use tester resources
        if (enableReleaseTester) { // check, if background processing should be enabled
            releaseTester();
        }

        // get all results from all outputs
        Map<String, MultiSiteBitSequence> bitsOfAllSignals = digCapture.getBits();

        if (messageLogLevel >= 4) {
            // Print out all results
            // Use tree map to generate a map sorted with respect to the signals (= keys of map)
            Map<String, MultiSiteBitSequence> bitsOfSortedSignals = new TreeMap<String, MultiSiteBitSequence>(bitsOfAllSignals);
            for (Entry<String, MultiSiteBitSequence> bitsOfSingleSignal : bitsOfSortedSignals.entrySet()) {
                print(bitsOfSingleSignal.getKey() + ":");
                if (bitsOfSingleSignal.getValue().get(context.getActiveSites()[0]).length() < 1024) {
                    println(bitsOfSingleSignal.getValue());
                }
                else {
                    for (int site : context.getActiveSites()) {
                        print(" site " + site + " -> "
                                + bitsOfSingleSignal.getValue().get(site).length() + " bits, ");
                    }
                    println();
                }
            }
        }

        // for all sites: check pass/fail and send results to datalog
        myFtd.evaluate(measurement.hasPassed());
    }
}
