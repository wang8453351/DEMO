package testMethods.acLib;

import xoc.dta.TestMethod;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/**
 *  This is a basic test method that executes a measurement.
 *  It might not even run a digital pattern or an operating sequence.
 *  It just checks, if the measurement was successfully executed
 *
 *
 */
public class ExecuteTest extends TestMethod {

    /** Main object for the test execution */
    public IMeasurement measurement;
    /** Functional test descriptor for datalog */
    public IFunctionalTestDescriptor myFtd;

    @Override
    public void execute() {
        // run measurement
        measurement.execute();

        // next test suite can start and use tester resources
        releaseTester();

        // for all sites: check pass/fail and send results to datalog
        myFtd.evaluate(measurement.hasPassed());

        // example of dumping debug messages to the console
        message(30, "[" + this.getClass().getName() + "] Execution done.");
    }
}
