package testMethods.acLib;

import xoc.dta.TestMethod;
import xoc.dta.annotations.In;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IDigInOutResults;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/**
 * This is a basic test method that executes a functional test.
 * It runs a digital pattern or an operating sequence.
 *
 */
public class FunctionalTest extends TestMethod {

    /** Main object for the test execution */
    public IMeasurement measurement;
    /** Functional test descriptor for datalog */
    public IFunctionalTestDescriptor myFtd;
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
        // run measurement
        measurement.execute();

        // protect results to be not overwritten
        IDigInOutResults passFailResults = measurement.digInOut(testSignals).preserveResults(myFtd);

        // next test suite can start and use tester resources
        releaseTester();

        // for all sites: check pass/fail and send results to datalog
        myFtd.evaluate(passFailResults);
    }
}
