package Thinking_In_Java;

import Thinking_In_Java.Leaf;
import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;

@SuppressWarnings("all")
public abstract class Suite_Leaf extends AbstractSuite<Leaf> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public Leaf create() {
      return new Leaf();
    }
  }
  
  public Suite_Leaf(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "Thinking_In_Java.Leaf",
        localName,
        suiteLocation,
        isCalled);
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
    parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
    parameters.addParameter("messageLogLevel", int.class, true, testMethod);
    
    super.initialize();
    
    // Initialize measurements
    
    // Initialize test descriptors
  }
}
