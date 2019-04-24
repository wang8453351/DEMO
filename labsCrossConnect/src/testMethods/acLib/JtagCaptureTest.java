package testMethods.acLib;

import xoc.dta.TestMethod;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.resultaccess.IProtocolInterfaceResults;
import xoc.dta.resultaccess.ITransactionSequenceResults;
import xoc.dta.resultaccess.datatypes.MultiSiteBitSequence;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/**
 *  This is a basic test method that executes a protocol aware test.
 *  It retrieves results of a capture transaction.
 *
 * */

public class JtagCaptureTest extends TestMethod {

    /** Main object for the test execution */
    public IMeasurement measurement;
    /** Functional test descriptor for datalog */
    public IFunctionalTestDescriptor myFtd;

    @Override
    public void execute() {

        // run measurement
        measurement.execute();

        // protect results to be not overwritten
        IProtocolInterfaceResults jtagResults = measurement.protocolInterface("JTAG").preserveResults();

        // next test suite can start and use tester resources
        releaseTester();

        ITransactionSequenceResults[] tSeqResults = jtagResults.transactSeq("captureJtagExample");

        if (messageLogLevel > 4) {
            for (ITransactionSequenceResults transactionResults : tSeqResults) {
                MultiSiteBitSequence paramCapturedBitSeq = transactionResults.getValueAsBitSequence("readData");
                println("Captured 'BitSequences' for transaction 'captureJtagExample' and parameter 'readData':");
                for (int site : context.getActiveSites()) {
                    println("Site " + site + ": " + paramCapturedBitSeq.get(site));
                }
            }
        }

        // print results for all sites to console
        message(10, "Test suite '" + context.getTestSuiteName() + "' has passed: " + measurement.hasPassed());

        // send results for all sites to datalog
        myFtd.evaluate(measurement.hasPassed());
    }
}
