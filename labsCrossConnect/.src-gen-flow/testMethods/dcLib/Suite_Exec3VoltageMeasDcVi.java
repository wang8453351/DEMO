package testMethods.dcLib;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import testMethods.dcLib.Exec3VoltageMeasDcVi;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IParametricTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_Exec3VoltageMeasDcVi extends AbstractSuite<Exec3VoltageMeasDcVi> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public Exec3VoltageMeasDcVi create() {
      return new Exec3VoltageMeasDcVi();
    }
  }
  
  public Suite_Exec3VoltageMeasDcVi(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "testMethods.dcLib.Exec3VoltageMeasDcVi",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link testMethods.dcLib.Exec3VoltageMeasDcVi#measurement Exec3VoltageMeasDcVi.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link testMethods.dcLib.Exec3VoltageMeasDcVi#ptdDC1 Exec3VoltageMeasDcVi.ptdDC1}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdDC1() {
    return testMethod.ptdDC1;
  }
  
  /**
   * See {@link testMethods.dcLib.Exec3VoltageMeasDcVi#ptdDC2 Exec3VoltageMeasDcVi.ptdDC2}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdDC2() {
    return testMethod.ptdDC2;
  }
  
  /**
   * See {@link testMethods.dcLib.Exec3VoltageMeasDcVi#ptdDC3 Exec3VoltageMeasDcVi.ptdDC3}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdDC3() {
    return testMethod.ptdDC3;
  }
  
  /**
   * See {@link testMethods.dcLib.Exec3VoltageMeasDcVi#signalsMeas Exec3VoltageMeasDcVi.signalsMeas}
   */
  @FlowVisible
  public synchronized String _get_signalsMeas() {
    return testMethod.signalsMeas;
  }
  
  /**
   * See {@link testMethods.dcLib.Exec3VoltageMeasDcVi#signalsMeas Exec3VoltageMeasDcVi.signalsMeas}
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
    parameters.addParameter("ptdDC1", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdDC2", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdDC3", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("signalsMeas", String.class, true, testMethod);
    parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
    parameters.addParameter("messageLogLevel", int.class, true, testMethod);
    
    super.initialize();
    
    // Initialize measurements
    testMethod.measurement =
    initializeMeasurement(testMethod,  "", "measurement", true);
    
    
    // Initialize test descriptors
    testMethod.ptdDC1 =
    initializeParametricTestDescriptor(testMethod,  "", "ptdDC1", true);
    
    testMethod.ptdDC2 =
    initializeParametricTestDescriptor(testMethod,  "", "ptdDC2", true);
    
    testMethod.ptdDC3 =
    initializeParametricTestDescriptor(testMethod,  "", "ptdDC3", true);
    
  }
}
