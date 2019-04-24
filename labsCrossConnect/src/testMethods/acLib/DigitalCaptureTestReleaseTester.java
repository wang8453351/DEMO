package testMethods.acLib;

import java.util.Arrays;
import java.util.Map;

import xoc.dta.TestMethod;
import xoc.dta.annotations.In;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IDigInOutCaptureResults;
import xoc.dta.resultaccess.datatypes.MultiSiteBitSequence;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/** Basic test method to run a digital pattern.
 *  This is a basic test method that executes a functional test.
 *  It runs a digital pattern or an operating sequence.
 *  It retrieves results of digital capture.
 *  It uses releaseTester() to enable background processing
 *  It dumps some debug info in the setup() and execute() section.
 *
 * */

public class DigitalCaptureTestReleaseTester extends TestMethod {

    /** Main object for the test execution */
    public IMeasurement measurement;
    /** Functional test descriptor for datalog */
    public IFunctionalTestDescriptor myFtd;
    /** Verbosity to console */
    @In public Long debugMode = 0L;
    /** Enable releaseTester to allow background postprocessing while the next test suite can be started */
    @In public Boolean enableReleaseTester = false;

    @Override
    public void setup() {
        if (debugMode>0) {
            // print out name of test suite and name of pattern or operating sequence
            System.out.println("-----------------------------------------------------------");
            String testSuiteName = context.getTestSuiteName();
            System.out.println("Started SETUP() of test suite '" + testSuiteName + "'.");
            if (measurement.getPatternName()!=null) {
                System.out.println("Functional setup done for " + measurement.getPatternName());
            }
            if (measurement.getOperatingSequenceName()!=null) {
                System.out.println("Functional setup done for " + measurement.getOperatingSequenceName());
            }
        }
    }

    @Override
    public void execute() {

        if (debugMode>0) {
            // print out name of test suite and name of pattern or operating sequence
            System.out.println("-----------------------------------------------------------");
            String testSuiteName = context.getTestSuiteName();
            System.out.println("Started EXECUTE() of test suite '" + testSuiteName + "'.");
            if (measurement.getPatternName()!=null) {
                System.out.println("Functional running pattern " + measurement.getPatternName());
            }
            if (measurement.getOperatingSequenceName()!=null) {
                System.out.println("Functional running oseq " + measurement.getOperatingSequenceName());
            }
            System.out.println("-----------------------------------------------------------");
        }

        // run measurement
        measurement.execute();

        // protect results
        IDigInOutCaptureResults digCapture = measurement.digInOut("allOutputs").preserveCaptureResults();

        // check, if background processing/releaseTester() should be enabled
        System.out.println("##################################################################");
        if (enableReleaseTester) {
            releaseTester();
            System.out.println("Tester released. ");
        }
        else {
            System.out.println("NO tester released. ");
        }
        System.out.println("##################################################################");

        // get all results from all outputs
        Map<String, MultiSiteBitSequence> bitsOfAllSignals = digCapture.getBits();

        // Print out all results
        String[] measSignals = bitsOfAllSignals.keySet().toArray(new String[0]);
        Arrays.sort(measSignals);
        int[] actSites = context.getActiveSites();
        for (String signal : measSignals) {
            System.out.print(signal + ":");
            for (int iSite : actSites) {
                System.out.print(" site " + iSite + " -> " + bitsOfAllSignals.get(signal).get(iSite).length() + " bits, ");
            }
            System.out.println();
            //            System.out.println(bitsOfAllSignals.get(signal));
        }

        // print results for all sites to console if debugMode > 0
        if (debugMode>0) {
            String testSuiteName = context.getTestSuiteName();
            System.out.println("Test suite '" + testSuiteName + "' has passed: " + measurement.hasPassed());
        }

        // send results for all sites to datalog
        myFtd.evaluate(measurement.hasPassed());
    }
}
