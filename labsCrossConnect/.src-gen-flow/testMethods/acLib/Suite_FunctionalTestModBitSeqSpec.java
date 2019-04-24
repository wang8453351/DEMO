package testMethods.acLib;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import testMethods.acLib.FunctionalTestModBitSeqSpec;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_FunctionalTestModBitSeqSpec extends AbstractSuite<FunctionalTestModBitSeqSpec> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public FunctionalTestModBitSeqSpec create() {
      return new FunctionalTestModBitSeqSpec();
    }
  }
  
  public Suite_FunctionalTestModBitSeqSpec(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "testMethods.acLib.FunctionalTestModBitSeqSpec",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#measurement FunctionalTestModBitSeqSpec.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#myFtd FunctionalTestModBitSeqSpec.myFtd}
   */
  @FlowVisible
  public synchronized IFunctionalTestDescriptor _get_myFtd() {
    return testMethod.myFtd;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#specName FunctionalTestModBitSeqSpec.specName}
   */
  @FlowVisible
  public synchronized String _get_specName() {
    return testMethod.specName;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#specName FunctionalTestModBitSeqSpec.specName}
   */
  @FlowVisible
  public synchronized void _set_specName(final String specName) {
    testMethod.specName = specName;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#specValue FunctionalTestModBitSeqSpec.specValue}
   */
  @FlowVisible
  public synchronized String _get_specValue() {
    return testMethod.specValue;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#specValue FunctionalTestModBitSeqSpec.specValue}
   */
  @FlowVisible
  public synchronized void _set_specValue(final String specValue) {
    testMethod.specValue = specValue;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#specValueChange FunctionalTestModBitSeqSpec.specValueChange}
   */
  @FlowVisible
  public synchronized Long _get_specValueChange() {
    return testMethod.specValueChange;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#specValueChange FunctionalTestModBitSeqSpec.specValueChange}
   */
  @FlowVisible
  public synchronized void _set_specValueChange(final Long specValueChange) {
    testMethod.specValueChange = specValueChange;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#testSignals FunctionalTestModBitSeqSpec.testSignals}
   */
  @FlowVisible
  public synchronized String _get_testSignals() {
    return testMethod.testSignals;
  }
  
  /**
   * See {@link testMethods.acLib.FunctionalTestModBitSeqSpec#testSignals FunctionalTestModBitSeqSpec.testSignals}
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
    parameters.addParameter("specName", String.class, true, testMethod);
    parameters.addParameter("specValue", String.class, true, testMethod);
    parameters.addParameter("specValueChange", Long.class, true, testMethod);
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
