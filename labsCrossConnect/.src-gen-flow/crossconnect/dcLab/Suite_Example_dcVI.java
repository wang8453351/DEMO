package crossconnect.dcLab;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import crossconnect.dcLab.Example_dcVI;
import java.util.logging.Logger;
import xoc.dta.datatypes.MultiSiteString;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IParametricTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_Example_dcVI extends AbstractSuite<Example_dcVI> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public Example_dcVI create() {
      return new Example_dcVI();
    }
  }
  
  public Suite_Example_dcVI(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "crossconnect.dcLab.Example_dcVI",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#debugMode Example_dcVI.debugMode}
   */
  @FlowVisible
  public synchronized Long _get_debugMode() {
    return testMethod.debugMode;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#debugMode Example_dcVI.debugMode}
   */
  @FlowVisible
  public synchronized void _set_debugMode(final Long debugMode) {
    testMethod.debugMode = debugMode;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#measAction Example_dcVI.measAction}
   */
  @FlowVisible
  public synchronized MultiSiteString _get_measAction() {
    return testMethod.measAction;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#measAction Example_dcVI.measAction}
   */
  @FlowVisible
  public synchronized void _set_measAction(final MultiSiteString measAction) {
    if (testMethod.measAction == null) {
        throwSetupException(
            "The test suite parameter \"measAction\" is not initialized.");
    } else {
        // MS types must use the setter to implement pass-by-value semantics
        testMethod.measAction.set(measAction);
    }
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#measurement Example_dcVI.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#pinList Example_dcVI.pinList}
   */
  @FlowVisible
  public synchronized MultiSiteString _get_pinList() {
    return testMethod.pinList;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#pinList Example_dcVI.pinList}
   */
  @FlowVisible
  public synchronized void _set_pinList(final MultiSiteString pinList) {
    if (testMethod.pinList == null) {
        throwSetupException(
            "The test suite parameter \"pinList\" is not initialized.");
    } else {
        // MS types must use the setter to implement pass-by-value semantics
        testMethod.pinList.set(pinList);
    }
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#pinListMeas Example_dcVI.pinListMeas}
   */
  @FlowVisible
  public synchronized String _get_pinListMeas() {
    return testMethod.pinListMeas;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#pinListMeas Example_dcVI.pinListMeas}
   */
  @FlowVisible
  public synchronized void _set_pinListMeas(final String pinListMeas) {
    testMethod.pinListMeas = pinListMeas;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#ptdDC1 Example_dcVI.ptdDC1}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdDC1() {
    return testMethod.ptdDC1;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#ptdDC2 Example_dcVI.ptdDC2}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdDC2() {
    return testMethod.ptdDC2;
  }
  
  /**
   * See {@link crossconnect.dcLab.Example_dcVI#ptdDC3 Example_dcVI.ptdDC3}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdDC3() {
    return testMethod.ptdDC3;
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
    parameters.addParameter("logger", Logger.class, true, testMethod);
    parameters.addParameter("measAction", MultiSiteString.class, true, testMethod);
    parameters.addParameter("measurement", IMeasurement.class, false, testMethod);
    parameters.addParameter("pinList", MultiSiteString.class, true, testMethod);
    parameters.addParameter("pinListMeas", String.class, true, testMethod);
    parameters.addParameter("ptdDC1", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdDC2", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdDC3", IParametricTestDescriptor.class, false, testMethod);
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
