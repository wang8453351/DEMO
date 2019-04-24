package flowLayout;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import flowLayout.BoardLayoutDemo;
import java.util.Map;
import javax.swing.JFrame;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;

@SuppressWarnings("all")
public abstract class Suite_BoardLayoutDemo extends AbstractSuite<BoardLayoutDemo> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public BoardLayoutDemo create() {
      return new BoardLayoutDemo();
    }
  }
  
  public Suite_BoardLayoutDemo(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "flowLayout.BoardLayoutDemo",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#condition BoardLayoutDemo.condition}
   */
  @FlowVisible
  public synchronized Map<String, String> _get_condition() {
    return testMethod.condition;
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#condition BoardLayoutDemo.condition}
   */
  @FlowVisible
  public synchronized void _set_condition(final Map<String, String> condition) {
    testMethod.condition = condition;
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#flag BoardLayoutDemo.flag}
   */
  @FlowVisible
  public synchronized boolean _get_flag() {
    return testMethod.flag;
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#flag BoardLayoutDemo.flag}
   */
  @FlowVisible
  public synchronized void _set_flag(final boolean flag) {
    testMethod.flag = flag;
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#jf BoardLayoutDemo.jf}
   */
  @FlowVisible
  public synchronized JFrame _get_jf() {
    return testMethod.jf;
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#jf BoardLayoutDemo.jf}
   */
  @FlowVisible
  public synchronized void _set_jf(final JFrame jf) {
    testMethod.jf = jf;
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#lock BoardLayoutDemo.lock}
   */
  @FlowVisible
  public synchronized int _get_lock() {
    return testMethod.lock;
  }
  
  /**
   * See {@link flowLayout.BoardLayoutDemo#lock BoardLayoutDemo.lock}
   */
  @FlowVisible
  public synchronized void _set_lock(final int lock) {
    testMethod.lock = lock;
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
    parameters.addParameter("condition", Map.class, true, testMethod);
    parameters.addParameter("flag", boolean.class, true, testMethod);
    parameters.addParameter("jf", JFrame.class, true, testMethod);
    parameters.addParameter("lock", int.class, true, testMethod);
    parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
    parameters.addParameter("messageLogLevel", int.class, true, testMethod);
    
    super.initialize();
    
    // Initialize measurements
    
    // Initialize test descriptors
  }
}
