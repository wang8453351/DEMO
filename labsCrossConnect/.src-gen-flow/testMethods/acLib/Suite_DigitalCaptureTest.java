package testMethods.acLib;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import testMethods.acLib.DigitalCaptureTest;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_DigitalCaptureTest extends AbstractSuite<DigitalCaptureTest> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public DigitalCaptureTest create() {
      return new DigitalCaptureTest();
    }
  }
  
  public Suite_DigitalCaptureTest(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "testMethods.acLib.DigitalCaptureTest",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTest#enableReleaseTester DigitalCaptureTest.enableReleaseTester}
   */
  @FlowVisible
  public synchronized Boolean _get_enableReleaseTester() {
    return testMethod.enableReleaseTester;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTest#enableReleaseTester DigitalCaptureTest.enableReleaseTester}
   */
  @FlowVisible
  public synchronized void _set_enableReleaseTester(final Boolean enableReleaseTester) {
    testMethod.enableReleaseTester = enableReleaseTester;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTest#measurement DigitalCaptureTest.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTest#myFtd DigitalCaptureTest.myFtd}
   */
  @FlowVisible
  public synchronized IFunctionalTestDescriptor _get_myFtd() {
    return testMethod.myFtd;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTest#testSignals DigitalCaptureTest.testSignals}
   */
  @FlowVisible
  public synchronized String _get_testSignals() {
    return testMethod.testSignals;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTest#testSignals DigitalCaptureTest.testSignals}
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
    parameters.addParameter("enableReleaseTester", Boolean.class, true, testMethod);
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
