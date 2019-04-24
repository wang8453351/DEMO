package crossconnect.basicDigital;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import ate.ext.prog.javaflow.context.TestProgramContext;
import com.advantest.itee.tml.actml.FunctionalTest;
import java.util.List;
import testMethods.acLib.Suite_DigitalCaptureTest;
import xoc.dta.ParameterGroupCollection;
import xoc.dta.datatypes.MultiSiteBoolean;
import xoc.dta.datatypes.UnwrapMultiSiteContainer;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.internal.annotations.SuppressFBWarnings;
import xoc.dta.measurement.IMeasurement;
import xoc.dta.testdescriptor.IFunctionalTestDescriptor;

/**
 * Test flow running basic digital tests.
 * 
 * @see "Testflow file reference in TDC (Topic 244398)"
 */
@SuppressFBWarnings
@SuppressWarnings("all")
public class FunctionalTests extends AbstractFlow {
  public static abstract class Suite_FunctionalTest extends AbstractSuite<FunctionalTest> {
    private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
      public FunctionalTest create() {
        return new FunctionalTest();
      }
    }
    
    public Suite_FunctionalTest(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
      super(
          parentTestflow,
          new TestMethodFactory(),
          "com.advantest.itee.tml.actml.FunctionalTest",
          localName,
          suiteLocation,
          isCalled);
    }
    
    /**
     * See {@link com.advantest.itee.tml.actml.FunctionalTest#funcTestDescriptor FunctionalTest.funcTestDescriptor}
     */
    @FlowVisible
    public synchronized IFunctionalTestDescriptor _get_funcTestDescriptor() {
      return testMethod.funcTestDescriptor;
    }
    
    /**
     * See {@link com.advantest.itee.tml.actml.FunctionalTest#measurement FunctionalTest.measurement}
     */
    @FlowVisible
    public synchronized IMeasurement _get_measurement() {
      return testMethod.measurement;
    }
    
    /**
     * See {@link com.advantest.itee.tml.actml.FunctionalTest#parallelGroup FunctionalTest.parallelGroup}
     */
    @FlowVisible
    public synchronized ParameterGroupCollection<FunctionalTest.ParallelGroupInfo> _get_parallelGroup() {
      return testMethod.parallelGroup;
    }
    
    /**
     * See {@link com.advantest.itee.tml.actml.FunctionalTest#signals FunctionalTest.signals}
     */
    @FlowVisible
    public synchronized String _get_signals() {
      return testMethod.signals;
    }
    
    /**
     * See {@link com.advantest.itee.tml.actml.FunctionalTest#signals FunctionalTest.signals}
     */
    @FlowVisible
    public synchronized void _set_signals(final String signals) {
      testMethod.signals = signals;
    }
    
    /**
     * See {@link com.advantest.itee.tml.actml.FunctionalTest#specParameters FunctionalTest.specParameters}
     */
    @FlowVisible
    public synchronized String _get_specParameters() {
      return testMethod.specParameters;
    }
    
    /**
     * See {@link com.advantest.itee.tml.actml.FunctionalTest#specParameters FunctionalTest.specParameters}
     */
    @FlowVisible
    public synchronized void _set_specParameters(final String specParameters) {
      testMethod.specParameters = specParameters;
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
      parameters.addParameter("funcTestDescriptor", IFunctionalTestDescriptor.class, false, testMethod);
      parameters.addParameter("isFirstTimeExecution", boolean.class, true, testMethod);
      parameters.addParameter("maxLogLevel", int.class, true, testMethod);
      parameters.addParameter("measurement", IMeasurement.class, false, testMethod);
      parameters.addParameter("originalSpecName", String.class, true, testMethod);
      parameters.addParameter("parallelGroup", ParameterGroupCollection.class, false, testMethod);
      parameters.addParameter("signals", String.class, true, testMethod);
      parameters.addParameter("specParameters", String.class, true, testMethod);
      parameters.addParameter("testDescriptorList", List.class, true, testMethod);
      parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
      parameters.addParameter("messageLogLevel", int.class, true, testMethod);
      
      super.initialize();
      
      // Initialize measurements
      testMethod.measurement =
      initializeMeasurement(testMethod,  "", "measurement", true);
      
      
      // Initialize test descriptors
      testMethod.funcTestDescriptor =
      initializeFunctionalTestDescriptor(testMethod,  "", "funcTestDescriptor", true);
      
    }
    
    public FunctionalTest.ParallelGroupInfo _createParameterGroup_parallelGroup(final String groupName) {
      final ParameterGroupCollection<FunctionalTest.ParallelGroupInfo> collection = testMethod.parallelGroup;
      if (collection == null) {
          throwSetupException(
              "The parameter group collection \"parallelGroup\" is not initialized.");
      }
      
      FunctionalTest.ParallelGroupInfo group = collection.get(groupName);
      
      if (group == null) {
          group = new FunctionalTest.ParallelGroupInfo();
          group.setId(groupName);
          collection.put(groupName, group);
      
          // Register group parameters
          addGroupParameter("parallelGroup", groupName, "parallelGroupName", String.class, true);
      
          // Initialize measurements
      
          // Initialize test descriptors
          group.parallelGroupDescriptor =
          initializeFunctionalTestDescriptor(group,  "parallelGroup[" + groupName+ "].", "parallelGroupDescriptor", true);
          
      }
      
      return group;
    }
  }
  
  public static class Suite_FunctionalTest_Functional extends FunctionalTests.Suite_FunctionalTest {
    private FunctionalTests parentTestflow;
    
    public Suite_FunctionalTest_Functional(final FunctionalTests parentTestflow, final boolean isCalled) {
      super(parentTestflow, "Functional", "/0/@testflow/@setup/@suites.0", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_Functional(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_FunctionalTest_Functionalx3 extends FunctionalTests.Suite_FunctionalTest {
    private FunctionalTests parentTestflow;
    
    public Suite_FunctionalTest_Functionalx3(final FunctionalTests parentTestflow, final boolean isCalled) {
      super(parentTestflow, "Functionalx3", "/0/@testflow/@setup/@suites.1", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_Functionalx3(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_FunctionalTest_LargeFunctional extends FunctionalTests.Suite_FunctionalTest {
    private FunctionalTests parentTestflow;
    
    public Suite_FunctionalTest_LargeFunctional(final FunctionalTests parentTestflow, final boolean isCalled) {
      super(parentTestflow, "LargeFunctional", "/0/@testflow/@setup/@suites.2", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_LargeFunctional(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_DigitalCaptureTest_DigitalCaptureRxx extends Suite_DigitalCaptureTest {
    private FunctionalTests parentTestflow;
    
    public Suite_DigitalCaptureTest_DigitalCaptureRxx(final FunctionalTests parentTestflow, final boolean isCalled) {
      super(parentTestflow, "DigitalCaptureRxx", "/0/@testflow/@setup/@suites.3", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_DigitalCaptureRxx(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static class Suite_DigitalCaptureTest_DigitalCaptureRxxLong extends Suite_DigitalCaptureTest {
    private FunctionalTests parentTestflow;
    
    public Suite_DigitalCaptureTest_DigitalCaptureRxxLong(final FunctionalTests parentTestflow, final boolean isCalled) {
      super(parentTestflow, "DigitalCaptureRxxLong", "/0/@testflow/@setup/@suites.4", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_DigitalCaptureRxxLong(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  /**
   * Digital functional pattern with a test method with (parameters for) datalogging
   */
  public final FunctionalTests.Suite_FunctionalTest_Functional Functional = new FunctionalTests.Suite_FunctionalTest_Functional(this, true);
  
  /**
   * Digital functional pattern in x3 mode
   */
  public final FunctionalTests.Suite_FunctionalTest_Functionalx3 Functionalx3 = new FunctionalTests.Suite_FunctionalTest_Functionalx3(this, true);
  
  /**
   * Large digital functional pattern
   */
  public final FunctionalTests.Suite_FunctionalTest_LargeFunctional LargeFunctional = new FunctionalTests.Suite_FunctionalTest_LargeFunctional(this, true);
  
  /**
   * Digital capture of a block of 16 signals and 8 vectors
   */
  public final FunctionalTests.Suite_DigitalCaptureTest_DigitalCaptureRxx DigitalCaptureRxx = new FunctionalTests.Suite_DigitalCaptureTest_DigitalCaptureRxx(this, true);
  
  /**
   * Digital capture of a block of 16 signals and 20480 vectors + release tester
   */
  public final FunctionalTests.Suite_DigitalCaptureTest_DigitalCaptureRxxLong DigitalCaptureRxxLong = new FunctionalTests.Suite_DigitalCaptureTest_DigitalCaptureRxxLong(this, true);
  
  public void addChildren() {
    // add suites
    suites.add(Functional);
    suites.add(Functionalx3);
    suites.add(LargeFunctional);
    suites.add(DigitalCaptureRxx);
    suites.add(DigitalCaptureRxxLong);
  }
  
  public FunctionalTests(final TestProgramContext context, final String name) {
    super(context, name, "crossconnect.basicDigital.FunctionalTests", "labsCrossConnect/src/crossconnect/basicDigital/FunctionalTests.flow");
    addChildren();
  }
  
  public FunctionalTests(final AbstractFlow parentTestflow, final String localName, final boolean isCalled) {
    super(parentTestflow, localName, "crossconnect.basicDigital.FunctionalTests", "labsCrossConnect/src/crossconnect/basicDigital/FunctionalTests.flow", isCalled);
    addChildren();
  }
  
  /**
   * enable 'releaseTester' for background processing
   */
  public MultiSiteBoolean backgroundProcessing = new MultiSiteBoolean(true, true);
  
  public void initialize() {
    super.initialize();
    
    // initialize chars
    
    // collect flow parameters
    addTestflowParameter("backgroundProcessing", backgroundProcessing);
  }
  
  /**
   * Set up parameters of the subflow Functional
   */
  private void setupParametersOf_Functional(final FunctionalTests.Suite_FunctionalTest_Functional it, final FunctionalTests FunctionalTests) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.basicDigital.mainSpecs.Functional");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.basicDigital.patterns.Functional");
    it._set_signals("allOutputs");
  }
  
  /**
   * Set up parameters of the subflow Functionalx3
   */
  private void setupParametersOf_Functionalx3(final FunctionalTests.Suite_FunctionalTest_Functionalx3 it, final FunctionalTests FunctionalTests) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.basicDigital.mainSpecs.Functionalx3");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.basicDigital.patterns.Functionalx3");
    it._set_signals("allOutputs");
  }
  
  /**
   * Set up parameters of the subflow LargeFunctional
   */
  private void setupParametersOf_LargeFunctional(final FunctionalTests.Suite_FunctionalTest_LargeFunctional it, final FunctionalTests FunctionalTests) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.basicDigital.mainSpecs.FunctionalSlow");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.basicDigital.patterns.FunctionalLarge");
    it._set_signals("allOutputs");
  }
  
  /**
   * Set up parameters of the subflow DigitalCaptureRxx
   */
  private void setupParametersOf_DigitalCaptureRxx(final FunctionalTests.Suite_DigitalCaptureTest_DigitalCaptureRxx it, final FunctionalTests FunctionalTests) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.basicDigital.mainSpecs.DigitalCapture");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.basicDigital.patterns.DigitalCaptureBlock16x8");
  }
  
  /**
   * Set up parameters of the subflow DigitalCaptureRxxLong
   */
  private void setupParametersOf_DigitalCaptureRxxLong(final FunctionalTests.Suite_DigitalCaptureTest_DigitalCaptureRxxLong it, final FunctionalTests FunctionalTests) {
    IMeasurement __get_measurement = it._get_measurement();
    __get_measurement._set_specification("crossconnect.basicDigital.mainSpecs.DigitalCapture");
    IMeasurement __get_measurement_1 = it._get_measurement();
    __get_measurement_1._set_pattern("crossconnect.basicDigital.patterns.DigitalCaptureBlock16x20k");
    it._set_enableReleaseTester(UnwrapMultiSiteContainer.<Boolean,MultiSiteBoolean>unwrap(this.backgroundProcessing));
  }
  
  /**
   * Generated code of the execute method
   */
  protected void executeTestflow() {
    this.Functional.execute();
    this.Functionalx3.execute();
    this.Functionalx3._get_bypass();
    this.DigitalCaptureRxx.execute();
    this.DigitalCaptureRxxLong.execute();
    this.LargeFunctional.execute();
  }
  
  public void debugHook() {
    
  }
}
