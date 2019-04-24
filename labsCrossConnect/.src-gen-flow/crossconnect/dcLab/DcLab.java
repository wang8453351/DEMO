package crossconnect.dcLab;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.context.TestProgramContext;
import testMethods.dcLib.Suite_DCLab;
import testMethods.dcLib.Suite_Exec3VoltageMeasDcVi;
import xoc.dta.internal.annotations.SuppressFBWarnings;
import xoc.dta.measurement.IMeasurement;

@SuppressFBWarnings
@SuppressWarnings("all")
public class DcLab extends AbstractFlow {
  public static class Suite_DCLab_DcInPattern extends Suite_DCLab {
    private DcLab parentTestflow;
    
    public Suite_DCLab_DcInPattern(final DcLab parentTestflow, final boolean isCalled) {
      super(parentTestflow, "DcInPattern", "/0/@testflow/@setup/@suites.0", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_DcInPattern(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_Exec3VoltageMeasDcVi_DcViLab extends Suite_Exec3VoltageMeasDcVi {
    private DcLab parentTestflow;
    
    public Suite_Exec3VoltageMeasDcVi_DcViLab(final DcLab parentTestflow, final boolean isCalled) {
      super(parentTestflow, "DcViLab", "/0/@testflow/@setup/@suites.1", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_DcViLab(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public final DcLab.Suite_DCLab_DcInPattern DcInPattern = new DcLab.Suite_DCLab_DcInPattern(this, true);
  
  public final DcLab.Suite_Exec3VoltageMeasDcVi_DcViLab DcViLab = new DcLab.Suite_Exec3VoltageMeasDcVi_DcViLab(this, true);
  
  public void addChildren() {
    // add suites
    suites.add(DcInPattern);
    suites.add(DcViLab);
  }
  
  public DcLab(final TestProgramContext context, final String name) {
    super(context, name, "crossconnect.dcLab.DcLab", "labsCrossConnect/src/crossconnect/dcLab/DcLab.flow");
    addChildren();
  }
  
  public DcLab(final AbstractFlow parentTestflow, final String localName, final boolean isCalled) {
    super(parentTestflow, localName, "crossconnect.dcLab.DcLab", "labsCrossConnect/src/crossconnect/dcLab/DcLab.flow", isCalled);
    addChildren();
  }
  
  public void initialize() {
    super.initialize();
    
    // initialize chars
    
    // collect flow parameters
  }
  
  /**
   * Set up parameters of the subflow DcInPattern
   */
  private void setupParametersOf_DcInPattern(final DcLab.Suite_DCLab_DcInPattern it, final DcLab DcLab) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.dcLab.DigInOutDC");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.dcLab.patterns.DcTrigger");
  }
  
  /**
   * Set up parameters of the subflow DcViLab
   */
  private void setupParametersOf_DcViLab(final DcLab.Suite_Exec3VoltageMeasDcVi_DcViLab it, final DcLab DcLab) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.dcLab.DcViLab");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_operatingSequence("crossconnect.dcLab.opSeqs.DcViLabComplex");
    it._set_signalsMeas("R00 + R02 + R03");
  }
  
  /**
   * Generated code of the execute method
   */
  protected void executeTestflow() {
    this.DcInPattern.execute();
    this.DcViLab.execute();
    this.message(30, "Test flow execution done.");
  }
  
  public void debugHook() {
    
  }
}
