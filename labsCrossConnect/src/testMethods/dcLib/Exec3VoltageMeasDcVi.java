package testMethods.dcLib;

import java.util.Map;
import java.util.Map.Entry;

import xoc.dta.TestMethod;
import xoc.dta.UncheckedDTAException;
import xoc.dta.annotations.In;
import xoc.dta.datatypes.MultiSiteDouble;
import xoc.dta.datatypes.MultiSiteDoubleArray;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IDcVIResults;
import xoc.dta.testdescriptor.IParametricTestDescriptor;

public class Exec3VoltageMeasDcVi extends TestMethod {

    /** main object for the test execution */
    public IMeasurement measurement;
    /** parametric test descriptor for data logging results of first action  */
    public IParametricTestDescriptor ptdDC1;
    /** parametric test descriptor for data logging results of second action  */
    public IParametricTestDescriptor ptdDC2;
    /** parametric test descriptor for data logging results of third action  */
    public IParametricTestDescriptor ptdDC3;
    /** List of signals for that voltages are measured   */
    @In public String signalsMeas;

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
        IDcVIResults results = measurement.dcVI(signalsMeas).preserveResults();

        // next test suite can start and use tester resources
        releaseTester();

        // upload results
        Map<String, MultiSiteDoubleArray> vMeasResults = results.iforceVmeas("").getVoltage();
        message(5, "Pin List = " + signalsMeas);

        /* print the results if the condition is true */
        if (messageLogLevel >= 5) {

            /* loop over all entries in the map 'resultsMappedToSignals' */
            for (Entry<String, MultiSiteDoubleArray> entry : vMeasResults.entrySet()) {

                /* get signal name, i.e. key of map entry */
                String signal = entry.getKey();

                /*
                 * retrieve the measured values of all actions on all sites for the specified signal to
                 * valuesOfSignal from the map entry
                 */
                MultiSiteDoubleArray valuesOfSignal = entry.getValue();

                /* loop over the number of actions */
                for (int actionCount = 0; actionCount < valuesOfSignal.length(); actionCount++) {

                    /* retrieve the measured values of the specified action */
                    MultiSiteDouble valuesOfAction = valuesOfSignal.getElement(actionCount);

                    /* loop over all active sites */
                    for (int site : context.getActiveSites()) {

                        /* assemble and print a formatted message */
                        String output = String.format("Action number \"%d\", signal \"%s\", site \"%d\", value measured %3.6f",
                                actionCount + 1, signal, site, valuesOfAction.get(site));
                        message(5, output);
                    }
                }
            }
        }

        /* Evaluate the measured results of the first action */
        ptdDC1.evaluate(vMeasResults, 0);

        /* Evaluate the measured results of the second action */
        ptdDC2.evaluate(vMeasResults, 1);

        /* Evaluate the measured results of the third action */
        ptdDC3.evaluate(vMeasResults, 2);
    }
}
