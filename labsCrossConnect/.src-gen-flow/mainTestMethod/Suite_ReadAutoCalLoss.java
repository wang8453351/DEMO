package mainTestMethod;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import mainTestMethod.ReadAutoCalLoss;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.testdescriptor.IParametricTestDescriptor;

@SuppressWarnings("all")
public abstract class Suite_ReadAutoCalLoss extends AbstractSuite<ReadAutoCalLoss> {
  private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
    public ReadAutoCalLoss create() {
      return new ReadAutoCalLoss();
    }
  }
  
  public Suite_ReadAutoCalLoss(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
    super(
        parentTestflow,
        new TestMethodFactory(),
        "mainTestMethod.ReadAutoCalLoss",
        localName,
        suiteLocation,
        isCalled);
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calInLossText ReadAutoCalLoss.calInLossText}
   */
  @FlowVisible
  public synchronized String _get_calInLossText() {
    return testMethod.calInLossText;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calInLossText ReadAutoCalLoss.calInLossText}
   */
  @FlowVisible
  public synchronized void _set_calInLossText(final String calInLossText) {
    testMethod.calInLossText = calInLossText;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calOutLossLText ReadAutoCalLoss.calOutLossLText}
   */
  @FlowVisible
  public synchronized String _get_calOutLossLText() {
    return testMethod.calOutLossLText;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calOutLossLText ReadAutoCalLoss.calOutLossLText}
   */
  @FlowVisible
  public synchronized void _set_calOutLossLText(final String calOutLossLText) {
    testMethod.calOutLossLText = calOutLossLText;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calOutLossText ReadAutoCalLoss.calOutLossText}
   */
  @FlowVisible
  public synchronized String _get_calOutLossText() {
    return testMethod.calOutLossText;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calOutLossText ReadAutoCalLoss.calOutLossText}
   */
  @FlowVisible
  public synchronized void _set_calOutLossText(final String calOutLossText) {
    testMethod.calOutLossText = calOutLossText;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calTotalLossG0Text ReadAutoCalLoss.calTotalLossG0Text}
   */
  @FlowVisible
  public synchronized String _get_calTotalLossG0Text() {
    return testMethod.calTotalLossG0Text;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calTotalLossG0Text ReadAutoCalLoss.calTotalLossG0Text}
   */
  @FlowVisible
  public synchronized void _set_calTotalLossG0Text(final String calTotalLossG0Text) {
    testMethod.calTotalLossG0Text = calTotalLossG0Text;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calTotalLossG2Text ReadAutoCalLoss.calTotalLossG2Text}
   */
  @FlowVisible
  public synchronized String _get_calTotalLossG2Text() {
    return testMethod.calTotalLossG2Text;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calTotalLossG2Text ReadAutoCalLoss.calTotalLossG2Text}
   */
  @FlowVisible
  public synchronized void _set_calTotalLossG2Text(final String calTotalLossG2Text) {
    testMethod.calTotalLossG2Text = calTotalLossG2Text;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calTotalLossG4Text ReadAutoCalLoss.calTotalLossG4Text}
   */
  @FlowVisible
  public synchronized String _get_calTotalLossG4Text() {
    return testMethod.calTotalLossG4Text;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#calTotalLossG4Text ReadAutoCalLoss.calTotalLossG4Text}
   */
  @FlowVisible
  public synchronized void _set_calTotalLossG4Text(final String calTotalLossG4Text) {
    testMethod.calTotalLossG4Text = calTotalLossG4Text;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#filePath ReadAutoCalLoss.filePath}
   */
  @FlowVisible
  public synchronized String _get_filePath() {
    return testMethod.filePath;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#filePath ReadAutoCalLoss.filePath}
   */
  @FlowVisible
  public synchronized void _set_filePath(final String filePath) {
    testMethod.filePath = filePath;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#flowCount ReadAutoCalLoss.flowCount}
   */
  @FlowVisible
  public synchronized Integer _get_flowCount() {
    return testMethod.flowCount;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#flowCount ReadAutoCalLoss.flowCount}
   */
  @FlowVisible
  public synchronized void _set_flowCount(final Integer flowCount) {
    testMethod.flowCount = flowCount;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#ptdInLoss ReadAutoCalLoss.ptdInLoss}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdInLoss() {
    return testMethod.ptdInLoss;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#ptdOutLoss ReadAutoCalLoss.ptdOutLoss}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdOutLoss() {
    return testMethod.ptdOutLoss;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#ptdOutLossL ReadAutoCalLoss.ptdOutLossL}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdOutLossL() {
    return testMethod.ptdOutLossL;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#ptdTotalLossG0 ReadAutoCalLoss.ptdTotalLossG0}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdTotalLossG0() {
    return testMethod.ptdTotalLossG0;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#ptdTotalLossG2 ReadAutoCalLoss.ptdTotalLossG2}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdTotalLossG2() {
    return testMethod.ptdTotalLossG2;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#ptdTotalLossG4 ReadAutoCalLoss.ptdTotalLossG4}
   */
  @FlowVisible
  public synchronized IParametricTestDescriptor _get_ptdTotalLossG4() {
    return testMethod.ptdTotalLossG4;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#sheetName ReadAutoCalLoss.sheetName}
   */
  @FlowVisible
  public synchronized String _get_sheetName() {
    return testMethod.sheetName;
  }
  
  /**
   * See {@link mainTestMethod.ReadAutoCalLoss#sheetName ReadAutoCalLoss.sheetName}
   */
  @FlowVisible
  public synchronized void _set_sheetName(final String sheetName) {
    testMethod.sheetName = sheetName;
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
    parameters.addParameter("calInLossText", String.class, true, testMethod);
    parameters.addParameter("calOutLossLText", String.class, true, testMethod);
    parameters.addParameter("calOutLossText", String.class, true, testMethod);
    parameters.addParameter("calTotalLossG0Text", String.class, true, testMethod);
    parameters.addParameter("calTotalLossG2Text", String.class, true, testMethod);
    parameters.addParameter("calTotalLossG4Text", String.class, true, testMethod);
    parameters.addParameter("filePath", String.class, true, testMethod);
    parameters.addParameter("flowCount", Integer.class, true, testMethod);
    parameters.addParameter("ptdInLoss", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdOutLoss", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdOutLossL", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdTotalLossG0", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdTotalLossG2", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("ptdTotalLossG4", IParametricTestDescriptor.class, false, testMethod);
    parameters.addParameter("sheetName", String.class, true, testMethod);
    parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
    parameters.addParameter("messageLogLevel", int.class, true, testMethod);
    
    super.initialize();
    
    // Initialize measurements
    
    // Initialize test descriptors
    testMethod.ptdInLoss =
    initializeParametricTestDescriptor(testMethod,  "", "ptdInLoss", true);
    
    testMethod.ptdOutLoss =
    initializeParametricTestDescriptor(testMethod,  "", "ptdOutLoss", true);
    
    testMethod.ptdOutLossL =
    initializeParametricTestDescriptor(testMethod,  "", "ptdOutLossL", true);
    
    testMethod.ptdTotalLossG0 =
    initializeParametricTestDescriptor(testMethod,  "", "ptdTotalLossG0", true);
    
    testMethod.ptdTotalLossG2 =
    initializeParametricTestDescriptor(testMethod,  "", "ptdTotalLossG2", true);
    
    testMethod.ptdTotalLossG4 =
    initializeParametricTestDescriptor(testMethod,  "", "ptdTotalLossG4", true);
    
  }
}
