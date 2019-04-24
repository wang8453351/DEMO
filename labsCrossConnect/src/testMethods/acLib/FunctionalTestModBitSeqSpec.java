package testMethods.acLib;

import xoc.dta.TestMethod;
import xoc.dta.annotations.In;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IDigInOutResults;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/**
 *  This is a basic test method that executes a functional test.
 *  It runs a digital pattern or an operating sequence.
 *  It modifies the value of a spec variable in the
 *  execute() section of the test method.
 *
 * */

public class FunctionalTestModBitSeqSpec extends TestMethod {

    /** Main object for the test execution */
    public IMeasurement measurement;
    /** Functional test descriptor for datalog */
    public IFunctionalTestDescriptor myFtd;
    /** Spec parameter of type 'BitSequence' to be changed */
    @In public String specName = "";
    /** New spec parameter value */
    @In public String specValue = "0x0";
    /** Change of spec parameter value from one site to the next */
    @In public Long specValueChange = -1L;
    /** digInOut signals to be tested for pass/fail */
    @In public String testSignals = "allIOs";

    @Override
    public void setup() {
        // empty
    }

    @Override
    public void update() {
        // Enable the cycle pass/fail when log level is 30 and higher.
        if (myFtd.getLogLevel() >= 30) {
            measurement.digInOut(testSignals).result().cyclePassFail().setEnabled(true);
        }
    }

    @Override
    public void execute() {

        // Process input data and set new values of the spec parameter:
        Long newSpecValue = Long.decode(specValue);
        if (specValueChange == 0L) {
            measurement.spec().setVariable(specName,"\"<0x" + Long.toHexString(newSpecValue) + ">\"");
        }
        else {
            for (int site : context.getActiveSites()) {
                measurement.spec().setVariable(site, specName,"\"<0x" + Long.toHexString(newSpecValue)+ ">\"");
                newSpecValue = newSpecValue + specValueChange;
            }
        }

        // run measurement
        measurement.execute();

        // protect results to be not overwritten
        IDigInOutResults passFailResults = measurement.digInOut(testSignals).preserveResults(myFtd);

        // next test suite can start and use tester resources
        releaseTester();

        // print results for all sites to console
        message(5, "Test suite '" + context.getTestSuiteName() + "' has passed: " + measurement.hasPassed());

        // for all sites: check pass/fail and send results to datalog
        myFtd.evaluate(passFailResults);
    }
}
