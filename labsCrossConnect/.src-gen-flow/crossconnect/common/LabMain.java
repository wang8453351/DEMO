package crossconnect.common;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.context.TestProgramContext;
import flowLayout.Suite_BoardLayoutDemo;
import mainTestMethod.Suite_ReadAutoCalLoss;
import xoc.dta.internal.annotations.SuppressFBWarnings;

@SuppressFBWarnings
@SuppressWarnings("all")
public class LabMain extends AbstractFlow {
  public static class Suite_ReadAutoCalLoss_ReadAutoCalLoss extends Suite_ReadAutoCalLoss {
    private LabMain parentTestflow;
    
    public Suite_ReadAutoCalLoss_ReadAutoCalLoss(final LabMain parentTestflow, final boolean isCalled) {
      super(parentTestflow, "ReadAutoCalLoss", "/0/@testflow/@setup/@suites.0", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_ReadAutoCalLoss(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_BoardLayoutDemo_CALGUI extends Suite_BoardLayoutDemo {
    private LabMain parentTestflow;
    
    public Suite_BoardLayoutDemo_CALGUI(final LabMain parentTestflow, final boolean isCalled) {
      super(parentTestflow, "CALGUI", "/0/@testflow/@setup/@suites.1", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_CALGUI(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public final LabMain.Suite_ReadAutoCalLoss_ReadAutoCalLoss ReadAutoCalLoss = new LabMain.Suite_ReadAutoCalLoss_ReadAutoCalLoss(this, true);
  
  public final LabMain.Suite_BoardLayoutDemo_CALGUI CALGUI = new LabMain.Suite_BoardLayoutDemo_CALGUI(this, true);
  
  public void addChildren() {
    // add suites
    suites.add(ReadAutoCalLoss);
    suites.add(CALGUI);
  }
  
  public LabMain(final TestProgramContext context, final String name) {
    super(context, name, "crossconnect.common.LabMain", "labsCrossConnect/src/crossconnect/common/LabMain.flow");
    addChildren();
  }
  
  public LabMain(final AbstractFlow parentTestflow, final String localName, final boolean isCalled) {
    super(parentTestflow, localName, "crossconnect.common.LabMain", "labsCrossConnect/src/crossconnect/common/LabMain.flow", isCalled);
    addChildren();
  }
  
  public void initialize() {
    super.initialize();
    
    // initialize chars
    
    // collect flow parameters
  }
  
  /**
   * Set up parameters of the subflow ReadAutoCalLoss
   */
  private void setupParametersOf_ReadAutoCalLoss(final LabMain.Suite_ReadAutoCalLoss_ReadAutoCalLoss it, final LabMain LabMain) {
  }
  
  /**
   * Set up parameters of the subflow CALGUI
   */
  private void setupParametersOf_CALGUI(final LabMain.Suite_BoardLayoutDemo_CALGUI it, final LabMain LabMain) {
  }
  
  /**
   * Generated code of the execute method
   */
  protected void executeTestflow() {
    this.ReadAutoCalLoss.execute();
    this.CALGUI.execute();
    this.addBin(1);
  }
  
  public void debugHook() {
    
  }
}
