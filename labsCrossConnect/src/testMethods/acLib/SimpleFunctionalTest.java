package testMethods.acLib;

import xoc.dta.TestMethod;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/** Very simple test method to run a digital pattern.
 *  This is a basic test method that executes a functional test.
 *  It runs a digital pattern and is implemented in a very simple way.
 *  In a training class, this might be the first test method that is shown.
 *
 * */

public class SimpleFunctionalTest extends TestMethod {

    /** Main object for the test execution */
    public IMeasurement measurement;
    /** Functional test descriptor for datalog */
    public IFunctionalTestDescriptor myFtd;

    @Override
    public void setup() {
        // nothing to do for setup
    }

    @Override
    public void execute() {

        // run measurement
        measurement.execute();

        // send results for all sites to datalog
        myFtd.evaluate(measurement.hasPassed());
    }
}
