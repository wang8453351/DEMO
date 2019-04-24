package testMethods.dcLib;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import testMethods.dcLib.DCLab;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IParametricTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_DCLab extends AbstractSuite<DCLab> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public DCLab create() {
      return new DCLab();
    }
  }
  
  public Suite_DCLab(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "testMethods.dcLib.DCLab",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link testMethods.dcLib.DCLab#measurement DCLab.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link testMethods.dcLib.DCLab#ptdDC DCLab.ptdDC}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdDC() {
    return testMethod.ptdDC;
  }
  
  /**
   * See {@link testMethods.dcLib.DCLab#signalsMeas DCLab.signalsMeas}
   */
  @FlowVisible
  public synchronized String _get_signalsMeas() {
    return testMethod.signalsMeas;
  }
  
  /**
   * See {@link testMethods.dcLib.DCLab#signalsMeas DCLab.signalsMeas}
   */
  @FlowVisible
  public synchronized void _set_signalsMeas(final String signalsMeas) {
    testMethod.signalsMeas = signalsMeas;
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
    parameters.addParameter("ptdDC", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("signalsMeas", String.class, true, testMethod);
    parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
    parameters.addParameter("messageLogLevel", int.class, true, testMethod);
    
    super.initialize();
    
    // Initialize measurements
    testMethod.measurement =
    initializeMeasurement(testMethod,  "", "measurement", true);
    
    
    // Initialize test descriptors
    testMethod.ptdDC =
    initializeParametricTestDescriptor(testMethod,  "", "ptdDC", true);
    
  }
}
