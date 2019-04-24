package testMethods.acLib;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import testMethods.acLib.FunctionalTest;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_FunctionalTest extends AbstractSuite<FunctionalTest> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public FunctionalTest create() {
      return new FunctionalTest();
    }
  }
  
  public Suite_FunctionalTest(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "testMethods.acLib.FunctionalTest",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTest#measurement FunctionalTest.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTest#myFtd FunctionalTest.myFtd}
   */
  @FlowVisible
  public synchronized IFunctionalTestDescriptor _get_myFtd() {
    return testMethod.myFtd;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTest#testSignals FunctionalTest.testSignals}
   */
  @FlowVisible
  public synchronized String _get_testSignals() {
    return testMethod.testSignals;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTest#testSignals FunctionalTest.testSignals}
   */
  @FlowVisible
  public synchronized void _set_testSignals(final String testSignals) {
    testMethod.testSignals = testSignals;
  }
  
  /**
   * See {@link xoc.dta.TestMethod#messageLogLevel TestMethod.messageLogLevel}
   */
  @FlowVisible
  public synchronized int _get_messageLogLevel() {
    return testMethod.messageLogLevel;
  }
  
  /**
   * See {@link xoc.dta.TestMethod#messageLogLevel TestMethod.messageLogLevel}
   */
  @FlowVisible
  public synchronized void _set_messageLogLevel(final int messageLogLevel) {
    testMethod.messageLogLevel = messageLogLevel;
  }
  
  public void initialize() {
    // Register parameters
    parameters.addParameter("measurement", IMeasurement.class, false, testMethod);
    parameters.addParameter("myFtd", IFunctionalTestDescriptor.class, false, testMethod);
    parameters.addParameter("testSignals", String.class, true, testMethod);
    parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
    parameters.addParameter("messageLogLevel", int.class, true, testMethod);
    
    super.initialize();
    
    // Initialize measurements
    testMethod.measurement =
    initializeMeasurement(testMethod,  "", "measurement", true);
    
    
    // Initialize test descriptors
    testMethod.myFtd =
    initializeFunctionalTestDescriptor(testMethod,  "", "myFtd", true);
    
  }
}
