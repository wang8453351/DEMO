package crossconnect.setupFilesLab;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.DataTypeExtensions;
import ate.ext.prog.javaflow.MultiSiteIf;
import ate.ext.prog.javaflow.context.TestProgramContext;
import testMethods.acLib.Suite_FunctionalTest;
import xoc.dta.datatypes.MultiSiteLong;
import xoc.dta.internal.annotations.SuppressFBWarnings;
import xoc.dta.measurement.IMeasurement;

@SuppressFBWarnings
@SuppressWarnings("all")
public class SetupFilesLab extends AbstractFlow {
  public static class Suite_FunctionalTest_ExampleTest extends Suite_FunctionalTest {
    private SetupFilesLab parentTestflow;
    
    public Suite_FunctionalTest_ExampleTest(final SetupFilesLab parentTestflow, final boolean isCalled) {
      super(parentTestflow, "ExampleTest", "/0/@testflow/@setup/@suites.0", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_ExampleTest(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_FunctionalTest_OpSeqLab extends Suite_FunctionalTest {
    private SetupFilesLab parentTestflow;
    
    public Suite_FunctionalTest_OpSeqLab(final SetupFilesLab parentTestflow, final boolean isCalled) {
      super(parentTestflow, "OpSeqLab", "/0/@testflow/@setup/@suites.1", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_OpSeqLab(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_FunctionalTest_SpecFileLab extends Suite_FunctionalTest {
    private SetupFilesLab parentTestflow;
    
    public Suite_FunctionalTest_SpecFileLab(final SetupFilesLab parentTestflow, final boolean isCalled) {
      super(parentTestflow, "SpecFileLab", "/0/@testflow/@setup/@suites.2", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_SpecFileLab(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_FunctionalTest_SpecFileMaxVcc extends Suite_FunctionalTest {
    private SetupFilesLab parentTestflow;
    
    public Suite_FunctionalTest_SpecFileMaxVcc(final SetupFilesLab parentTestflow, final boolean isCalled) {
      super(parentTestflow, "SpecFileMaxVcc", "/0/@testflow/@setup/@suites.3", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_SpecFileMaxVcc(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public final SetupFilesLab.Suite_FunctionalTest_ExampleTest ExampleTest = new SetupFilesLab.Suite_FunctionalTest_ExampleTest(this, true);
  
  public final SetupFilesLab.Suite_FunctionalTest_OpSeqLab OpSeqLab = new SetupFilesLab.Suite_FunctionalTest_OpSeqLab(this, true);
  
  public final SetupFilesLab.Suite_FunctionalTest_SpecFileLab SpecFileLab = new SetupFilesLab.Suite_FunctionalTest_SpecFileLab(this, true);
  
  public final SetupFilesLab.Suite_FunctionalTest_SpecFileMaxVcc SpecFileMaxVcc = new SetupFilesLab.Suite_FunctionalTest_SpecFileMaxVcc(this, true);
  
  public void addChildren() {
    // add suites
    suites.add(ExampleTest);
    suites.add(OpSeqLab);
    suites.add(SpecFileLab);
    suites.add(SpecFileMaxVcc);
  }
  
  public SetupFilesLab(final TestProgramContext context, final String name) {
    super(context, name, "crossconnect.setupFilesLab.SetupFilesLab", "labsCrossConnect/src/crossconnect/setupFilesLab/SetupFilesLab.flow");
    addChildren();
  }
  
  public SetupFilesLab(final AbstractFlow parentTestflow, final String localName, final boolean isCalled) {
    super(parentTestflow, localName, "crossconnect.setupFilesLab.SetupFilesLab", "labsCrossConnect/src/crossconnect/setupFilesLab/SetupFilesLab.flow", isCalled);
    addChildren();
  }
  
  public MultiSiteLong failingTests = new MultiSiteLong(0, true);
  
  public void initialize() {
    super.initialize();
    
    // initialize chars
    
    // collect flow parameters
    addTestflowParameter("failingTests", failingTests);
  }
  
  /**
   * Set up parameters of the subflow ExampleTest
   */
  private void setupParametersOf_ExampleTest(final SetupFilesLab.Suite_FunctionalTest_ExampleTest it, final SetupFilesLab SetupFilesLab) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.setupFilesLab.mainSpecs.ExampleTest");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.setupFilesLab.patterns.Counting_00_15x1");
  }
  
  /**
   * Set up parameters of the subflow OpSeqLab
   */
  private void setupParametersOf_OpSeqLab(final SetupFilesLab.Suite_FunctionalTest_OpSeqLab it, final SetupFilesLab SetupFilesLab) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.setupFilesLab.mainSpecs.OpSeqLab");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_operatingSequence("crossconnect.setupFilesLab.OpSeqLab");
    it._set_testSignals("gR00_R07");
  }
  
  /**
   * Set up parameters of the subflow SpecFileLab
   */
  private void setupParametersOf_SpecFileLab(final SetupFilesLab.Suite_FunctionalTest_SpecFileLab it, final SetupFilesLab SetupFilesLab) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.setupFilesLab.mainSpecs.SpecFileLab");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_operatingSequence("crossconnect.setupFilesLab.SpecFileLab");
  }
  
  /**
   * Set up parameters of the subflow SpecFileMaxVcc
   */
  private void setupParametersOf_SpecFileMaxVcc(final SetupFilesLab.Suite_FunctionalTest_SpecFileMaxVcc it, final SetupFilesLab SetupFilesLab) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.setupFilesLab.mainSpecs.SpecFileMaxVcc");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.setupFilesLab.patterns.Counting_00_15x1");
  }
  
  /**
   * Generated code of the execute method
   */
  protected void executeTestflow() {
    this.ExampleTest.execute();
    this.OpSeqLab.execute();
    this.SpecFileLab.execute();
    this.SpecFileMaxVcc.execute();
    final Runnable _function = new Runnable() {
      @Override
      public void run() {
        MultiSiteLong _plus = DataTypeExtensions.operator_plus(SetupFilesLab.this.failingTests, new MultiSiteLong(1, true));
        SetupFilesLab.this.failingTests.set(_plus);
      }
    };
    MultiSiteIf.run(DataTypeExtensions.operator_not(this.ExampleTest.getPass()), _function, null);
    if (hasNoActiveSites()) {
        return;
    }
    
    final Runnable _function_1 = new Runnable() {
      @Override
      public void run() {
        SetupFilesLab.this.addBin(1);
      }
    };
    final Runnable _function_2 = new Runnable() {
      @Override
      public void run() {
        SetupFilesLab.this.addBin(41);
      }
    };
    MultiSiteIf.run(DataTypeExtensions.operator_equals(this.failingTests, new MultiSiteLong(0, true)), _function_1, _function_2);
    if (hasNoActiveSites()) {
        return;
    }
    
  }
  
  public void debugHook() {
    
  }
}
