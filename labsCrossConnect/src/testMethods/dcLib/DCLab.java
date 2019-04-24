package testMethods.dcLib;


import xoc.dta.TestMethod;
import xoc.dta.UncheckedDTAException;
import xoc.dta.annotations.In;
import xoc.dta.datatypes.MultiSiteDoubleArray;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IDigInOutActionResults;
import xoc.dta.testdescriptor.IParametricTestDescriptor;


public class DCLab extends TestMethod {

    /** main object for the test execution */
    public IMeasurement measurement;
    /** parametric test descriptor for datalog */
    public IParametricTestDescriptor ptdDC;
    /** List of signals for that voltages are measured   */
    @In public String signalsMeas = "R00"; // Change default value

    @Override
    public void setup() {
        // Check, if test signals are valid
        if (signalsMeas.trim().isEmpty()) {
            throw new UncheckedDTAException("[" + this.getClass().getName() + ": line "
                    + new Exception().getStackTrace()[0].getLineNumber()
                    + "] Input parameter 'testSignals' (value '" + signalsMeas
                    + "' ) is empty in test suite '" + context.getTestSuiteName() + "'.");
        }
    }

    @Override
    public void update() {
        // Empty update() method
    }

    @Override
    public void execute() {

        // run measurement
        measurement.execute();

        // get results for all actions of signals 'signalsMeas' defined in the specification
        IDigInOutActionResults results = measurement.digInOut(signalsMeas).preserveActionResults();

        // next test suite can start and use tester resources
        releaseTester();

        // upload results
        MultiSiteDoubleArray measVoltages = results.iforceVmeas("").getVoltage(signalsMeas);
        message(5, "Pin List = " + signalsMeas);

        /* print the results if the condition is true */
        if (messageLogLevel >= 5) {
            for (int site : context.getActiveSites()) {
                /* assemble and print a formatted message */
                String output = String.format("Site \"%d\", voltages measured: %6.3f, result: %s",
                        site, measVoltages.getElement(0).get(site), (measurement.hasPassed(site) ? "PASS!" : "FAIL!"));
                message(5, output);
            }
        }


        /* Evaluate the measured results of the first and only action */
        ptdDC.evaluate(results.iforceVmeas(""), 0);
    }
}
