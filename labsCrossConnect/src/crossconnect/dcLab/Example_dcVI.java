package crossconnect.dcLab;

import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import xoc.dta.TestMethod;
import xoc.dta.annotations.In;
import xoc.dta.datatypes.MultiSiteDouble;
import xoc.dta.datatypes.MultiSiteDoubleArray;
import xoc.dta.datatypes.MultiSiteString;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IDcVIResults;
import xoc.dta.testdescriptor.IParametricTestDescriptor;

public class Example_dcVI extends TestMethod {

    /** main object for the test execution */
    public IMeasurement measurement;
    /** parametric test descriptor for datalog */
    public IParametricTestDescriptor ptdDC1;
    public IParametricTestDescriptor ptdDC2;
    public IParametricTestDescriptor ptdDC3;
    /** name of vmeas action from spec sheet */
    @In public MultiSiteString pinList;
    /** overwrites action property from spec sheet - not used yet */
    //   @In public MultiSiteLong   averages;
    /** verbosity to console */
    @In public Long debugMode = 0L;
    /** needs to match pinList from measAction */
    @In public MultiSiteString measAction;

    @In public String pinListMeas;

    /** by setting the log level in logging.properties the verbosity to console can be controlled */
    private Logger logger;


    @Override
    public void setup() {
        if (debugMode>0) {
            System.out.println("-----------------------------------------------------------");
            String testSuiteName = context.getTestSuiteName();
            System.out.println("Started SETUP() of test suite '" + testSuiteName + "'.");
            System.out.println("Sequenced_DC_PPMU.java setup done!");
        }
    }

    @Override
    public void execute() {
        if (debugMode>0) {
            System.out.println("-----------------------------------------------------------");
            String testSuiteName = context.getTestSuiteName();
            System.out.println("Started EXECUTE() of test suite '" + testSuiteName + "'.");
            System.out.println("Sequenced_DC_PPMU " + measurement.getPatternName());
        }

        // run measurement
        measurement.execute();

        // get value results for all DC actions defined in spec sheet
        //        IDcResults result = measurement.dcVI("R00").getDcResults();
        System.out.println(" Pin List =" + pinListMeas);
        IDcVIResults result = measurement.dcVI(pinListMeas).preserveResults();
        Map <String,MultiSiteDoubleArray> myResultMap;
        myResultMap = result.iforceVmeas("").getVoltage();  // Why must the user know the action type?

        // get value results for all DC actions defined in spec sheet
        myResultMap=result.iforceVmeas("").getVoltage();
        int iElementCount=0;
        java.util.Iterator<Entry<String, MultiSiteDoubleArray>> it;
        it = myResultMap.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, MultiSiteDoubleArray> mapEntry = it.next();
            MultiSiteDoubleArray msdCurrVal;
            String pin;
            pin = mapEntry.getKey();
            msdCurrVal = mapEntry.getValue();
            int[] actSites = msdCurrVal.getActiveSites();
            int numEl = msdCurrVal.length(); // Assume same number of elements across sites or exception
            for (int count=0 ; count<numEl; count++) {
                MultiSiteDouble msdDataSingleSlice = msdCurrVal.getElement(count);
                Double[] resDataSlice = msdDataSingleSlice.getData();
                for(int siteres : actSites ) {
                    System.out.println("Element[" + iElementCount + "], Pin[" + pin + "] , Site[" + siteres + "], Value=" + resDataSlice[siteres-1]);
                }
                iElementCount++;
            }
            //            System.out.println("Pin[" + mapEntry.getKey()+ "] = "+mapEntry.getValue());
        }

        // Overwrite limits provided by the test table
        ptdDC1.setLowLimit(0.9).setHighLimit(1.1).setTestText("ParametricDcVI1").setTestNumber(401);
        ptdDC2.setLowLimit(0.8).setHighLimit(1.0).setTestText("ParametricDcVI2").setTestNumber(402);
        ptdDC3.setLowLimit(2.4).setHighLimit(2.6).setTestText("ParametricDcVI3").setTestNumber(403);

        // Send parametric test results to datalog
        ptdDC1.evaluate(myResultMap, 0);
        ptdDC2.evaluate(myResultMap, 1);
        ptdDC3.evaluate(myResultMap, 2);

        // send results to console if desired
        logger.info(myResultMap.toString());
        logger.info(measurement.hasPassed().toString());

        System.out.println();
        System.out.println("Sequenced_DC_PPMU.java ended");
        System.out.println("===========================");
    }
}
