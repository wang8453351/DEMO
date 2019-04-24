package testMethods.acLib;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import testMethods.acLib.DigitalCaptureTestReleaseTester;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_DigitalCaptureTestReleaseTester extends AbstractSuite<DigitalCaptureTestReleaseTester> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public DigitalCaptureTestReleaseTester create() {
      return new DigitalCaptureTestReleaseTester();
    }
  }
  
  public Suite_DigitalCaptureTestReleaseTester(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "testMethods.acLib.DigitalCaptureTestReleaseTester",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTestReleaseTester#debugMode DigitalCaptureTestReleaseTester.debugMode}
   */
  @FlowVisible
  public synchronized Long _get_debugMode() {
    return testMethod.debugMode;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTestReleaseTester#debugMode DigitalCaptureTestReleaseTester.debugMode}
   */
  @FlowVisible
  public synchronized void _set_debugMode(final Long debugMode) {
    testMethod.debugMode = debugMode;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTestReleaseTester#enableReleaseTester DigitalCaptureTestReleaseTester.enableReleaseTester}
   */
  @FlowVisible
  public synchronized Boolean _get_enableReleaseTester() {
    return testMethod.enableReleaseTester;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTestReleaseTester#enableReleaseTester DigitalCaptureTestReleaseTester.enableReleaseTester}
   */
  @FlowVisible
  public synchronized void _set_enableReleaseTester(final Boolean enableReleaseTester) {
    testMethod.enableReleaseTester = enableReleaseTester;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTestReleaseTester#measurement DigitalCaptureTestReleaseTester.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link testMethods.acLib.DigitalCaptureTestReleaseTester#myFtd DigitalCaptureTestReleaseTester.myFtd}
   */
  @FlowVisible
  public synchronized IFunctionalTestDescriptor _get_myFtd() {
    return testMethod.myFtd;
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
    parameters.addParameter("debugMode", Long.class, true, testMethod);
    parameters.addParameter("enableReleaseTester", Boolean.class, true, testMethod);
    parameters.addParameter("measurement", IMeasurement.class, false, testMethod);
    parameters.addParameter("myFtd", IFunctionalTestDescriptor.class, false, testMethod);
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
