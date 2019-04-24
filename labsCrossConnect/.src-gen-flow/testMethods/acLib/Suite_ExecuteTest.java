package testMethods.acLib;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import testMethods.acLib.ExecuteTest;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_ExecuteTest extends AbstractSuite<ExecuteTest> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public ExecuteTest create() {
      return new ExecuteTest();
    }
  }
  
  public Suite_ExecuteTest(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "testMethods.acLib.ExecuteTest",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link testMethods.acLib.ExecuteTest#measurement ExecuteTest.measurement}
   */
  @FlowVisible
  public synchronized IMeasurement _get_measurement() {
    return testMethod.measurement;
  }
  
  /**
   * See {@link testMethods.acLib.ExecuteTest#myFtd ExecuteTest.myFtd}
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
