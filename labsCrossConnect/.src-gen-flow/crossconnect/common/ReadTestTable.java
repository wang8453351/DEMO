package crossconnect.common;

import ate.ext.prog.javaflow.AbstractFlow;
import ate.ext.prog.javaflow.AbstractSuite;
import ate.ext.prog.javaflow.context.TestProgramContext;
import com.advantest.itee.testtable.testmethod.TestTableReader;
import com.advantest.itee.testtable.testmethod.TestTableWriter;
import xoc.dta.internal.Dependencies;
import xoc.dta.internal.FlowVisible;
import xoc.dta.internal.annotations.SuppressFBWarnings;

/**
 * This PreBind testflow is executed before the test program is bound.
 * It is used, for example, to load a test table from disk.
 * 
 * @see "Auxiliary testflows in TDC (Topic 251709)"
 */
@SuppressFBWarnings
@SuppressWarnings("all")
public class ReadTestTable extends AbstractFlow {
  public static abstract class Suite_TestTableReader extends AbstractSuite<TestTableReader> {
    private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
      public TestTableReader create() {
        return new TestTableReader();
      }
    }
    
    public Suite_TestTableReader(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
      super(
          parentTestflow,
          new TestMethodFactory(),
          "com.advantest.itee.testtable.testmethod.TestTableReader",
          localName,
          suiteLocation,
          isCalled);
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#createParameterGroups TestTableReader.createParameterGroups}
     */
    @FlowVisible
    public synchronized boolean _get_createParameterGroups() {
      return testMethod.createParameterGroups;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#createParameterGroups TestTableReader.createParameterGroups}
     */
    @FlowVisible
    public synchronized void _set_createParameterGroups(final boolean createParameterGroups) {
      testMethod.createParameterGroups = createParameterGroups;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#errorLogDumpDisabled TestTableReader.errorLogDumpDisabled}
     */
    @FlowVisible
    public synchronized boolean _get_errorLogDumpDisabled() {
      return testMethod.errorLogDumpDisabled;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#errorLogDumpDisabled TestTableReader.errorLogDumpDisabled}
     */
    @FlowVisible
    public synchronized void _set_errorLogDumpDisabled(final boolean errorLogDumpDisabled) {
      testMethod.errorLogDumpDisabled = errorLogDumpDisabled;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#errorLogPath TestTableReader.errorLogPath}
     */
    @FlowVisible
    public synchronized String _get_errorLogPath() {
      return testMethod.errorLogPath;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#errorLogPath TestTableReader.errorLogPath}
     */
    @FlowVisible
    public synchronized void _set_errorLogPath(final String errorLogPath) {
      testMethod.errorLogPath = errorLogPath;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#forceImport TestTableReader.forceImport}
     */
    @FlowVisible
    public synchronized boolean _get_forceImport() {
      return testMethod.forceImport;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#forceImport TestTableReader.forceImport}
     */
    @FlowVisible
    public synchronized void _set_forceImport(final boolean forceImport) {
      testMethod.forceImport = forceImport;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#limitCategory TestTableReader.limitCategory}
     */
    @FlowVisible
    public synchronized String _get_limitCategory() {
      return testMethod.limitCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#limitCategory TestTableReader.limitCategory}
     */
    @FlowVisible
    public synchronized void _set_limitCategory(final String limitCategory) {
      testMethod.limitCategory = limitCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#logLevelCategory TestTableReader.logLevelCategory}
     */
    @FlowVisible
    public synchronized String _get_logLevelCategory() {
      return testMethod.logLevelCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#logLevelCategory TestTableReader.logLevelCategory}
     */
    @FlowVisible
    public synchronized void _set_logLevelCategory(final String logLevelCategory) {
      testMethod.logLevelCategory = logLevelCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#noRedundantItemWarningInConsole TestTableReader.noRedundantItemWarningInConsole}
     */
    @FlowVisible
    public synchronized boolean _get_noRedundantItemWarningInConsole() {
      return testMethod.noRedundantItemWarningInConsole;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#noRedundantItemWarningInConsole TestTableReader.noRedundantItemWarningInConsole}
     */
    @FlowVisible
    public synchronized void _set_noRedundantItemWarningInConsole(final boolean noRedundantItemWarningInConsole) {
      testMethod.noRedundantItemWarningInConsole = noRedundantItemWarningInConsole;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#printToConsole TestTableReader.printToConsole}
     */
    @FlowVisible
    public synchronized boolean _get_printToConsole() {
      return testMethod.printToConsole;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#printToConsole TestTableReader.printToConsole}
     */
    @FlowVisible
    public synchronized void _set_printToConsole(final boolean printToConsole) {
      testMethod.printToConsole = printToConsole;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#specCategory TestTableReader.specCategory}
     */
    @FlowVisible
    public synchronized String _get_specCategory() {
      return testMethod.specCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#specCategory TestTableReader.specCategory}
     */
    @FlowVisible
    public synchronized void _set_specCategory(final String specCategory) {
      testMethod.specCategory = specCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#testTablePath TestTableReader.testTablePath}
     */
    @FlowVisible
    public synchronized String _get_testTablePath() {
      return testMethod.testTablePath;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#testTablePath TestTableReader.testTablePath}
     */
    @FlowVisible
    public synchronized void _set_testTablePath(final String testTablePath) {
      testMethod.testTablePath = testTablePath;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#useCache TestTableReader.useCache}
     */
    @FlowVisible
    public synchronized boolean _get_useCache() {
      return testMethod.useCache;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#useCache TestTableReader.useCache}
     */
    @FlowVisible
    public synchronized void _set_useCache(final boolean useCache) {
      testMethod.useCache = useCache;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#variablesCategory TestTableReader.variablesCategory}
     */
    @FlowVisible
    public synchronized String _get_variablesCategory() {
      return testMethod.variablesCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableReader#variablesCategory TestTableReader.variablesCategory}
     */
    @FlowVisible
    public synchronized void _set_variablesCategory(final String variablesCategory) {
      testMethod.variablesCategory = variablesCategory;
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
      parameters.addParameter("createParameterGroups", boolean.class, true, testMethod);
      parameters.addParameter("errorLogDumpDisabled", boolean.class, true, testMethod);
      parameters.addParameter("errorLogPath", String.class, true, testMethod);
      parameters.addParameter("forceImport", boolean.class, true, testMethod);
      parameters.addParameter("limitCategory", String.class, true, testMethod);
      parameters.addParameter("logLevelCategory", String.class, true, testMethod);
      parameters.addParameter("noRedundantItemWarningInConsole", boolean.class, true, testMethod);
      parameters.addParameter("printToConsole", boolean.class, true, testMethod);
      parameters.addParameter("specCategory", String.class, true, testMethod);
      parameters.addParameter("testTablePath", String.class, true, testMethod);
      parameters.addParameter("useCache", boolean.class, true, testMethod);
      parameters.addParameter("variablesCategory", String.class, true, testMethod);
      parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
      parameters.addParameter("messageLogLevel", int.class, true, testMethod);
      
      super.initialize();
      
      // Initialize measurements
      
      // Initialize test descriptors
    }
  }
  
  public static class Suite_TestTableReader_importTestTable extends ReadTestTable.Suite_TestTableReader {
    private ReadTestTable parentTestflow;
    
    public Suite_TestTableReader_importTestTable(final ReadTestTable parentTestflow, final boolean isCalled) {
      super(parentTestflow, "importTestTable", "/0/@testflow/@setup/@suites.0", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_importTestTable(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public static abstract class Suite_TestTableWriter extends AbstractSuite<TestTableWriter> {
    private static class TestMethodFactory implements AbstractSuite.TestMethodFactory {
      public TestTableWriter create() {
        return new TestTableWriter();
      }
    }
    
    public Suite_TestTableWriter(final AbstractFlow parentTestflow, final String localName, final String suiteLocation, final boolean isCalled) {
      super(
          parentTestflow,
          new TestMethodFactory(),
          "com.advantest.itee.testtable.testmethod.TestTableWriter",
          localName,
          suiteLocation,
          isCalled);
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#exportOption TestTableWriter.exportOption}
     */
    @FlowVisible
    public synchronized String _get_exportOption() {
      return testMethod.exportOption;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#exportOption TestTableWriter.exportOption}
     */
    @FlowVisible
    public synchronized void _set_exportOption(final String exportOption) {
      testMethod.exportOption = exportOption;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#limitCategory TestTableWriter.limitCategory}
     */
    @FlowVisible
    public synchronized String _get_limitCategory() {
      return testMethod.limitCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#limitCategory TestTableWriter.limitCategory}
     */
    @FlowVisible
    public synchronized void _set_limitCategory(final String limitCategory) {
      testMethod.limitCategory = limitCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#logLevelCategory TestTableWriter.logLevelCategory}
     */
    @FlowVisible
    public synchronized String _get_logLevelCategory() {
      return testMethod.logLevelCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#logLevelCategory TestTableWriter.logLevelCategory}
     */
    @FlowVisible
    public synchronized void _set_logLevelCategory(final String logLevelCategory) {
      testMethod.logLevelCategory = logLevelCategory;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#outputFileName TestTableWriter.outputFileName}
     */
    @FlowVisible
    public synchronized String _get_outputFileName() {
      return testMethod.outputFileName;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#outputFileName TestTableWriter.outputFileName}
     */
    @FlowVisible
    public synchronized void _set_outputFileName(final String outputFileName) {
      testMethod.outputFileName = outputFileName;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#testsSheetByFlow TestTableWriter.testsSheetByFlow}
     */
    @FlowVisible
    public synchronized boolean _get_testsSheetByFlow() {
      return testMethod.testsSheetByFlow;
    }
    
    /**
     * See {@link com.advantest.itee.testtable.testmethod.TestTableWriter#testsSheetByFlow TestTableWriter.testsSheetByFlow}
     */
    @FlowVisible
    public synchronized void _set_testsSheetByFlow(final boolean testsSheetByFlow) {
      testMethod.testsSheetByFlow = testsSheetByFlow;
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
      parameters.addParameter("exportOption", String.class, true, testMethod);
      parameters.addParameter("limitCategory", String.class, true, testMethod);
      parameters.addParameter("logLevelCategory", String.class, true, testMethod);
      parameters.addParameter("outputFileName", String.class, true, testMethod);
      parameters.addParameter("testsSheetByFlow", boolean.class, true, testMethod);
      parameters.addParameter("dependencies", Dependencies.class, true, testMethod);
      parameters.addParameter("messageLogLevel", int.class, true, testMethod);
      
      super.initialize();
      
      // Initialize measurements
      
      // Initialize test descriptors
    }
  }
  
  public static class Suite_TestTableWriter_exportTestTable extends ReadTestTable.Suite_TestTableWriter {
    private ReadTestTable parentTestflow;
    
    public Suite_TestTableWriter_exportTestTable(final ReadTestTable parentTestflow, final boolean isCalled) {
      super(parentTestflow, "exportTestTable", "/0/@testflow/@setup/@suites.1", isCalled);
      this.parentTestflow = parentTestflow;
    }
    
    public void setupParameters() {
      super.setupParameters();
      testMethod.messageLogLevel = parentTestflow.messageLogLevel.getAsInt();
      parentTestflow.setupParametersOf_exportTestTable(this, parentTestflow);
    }
    
    public void debugHook() {
      
    }
    
    public void debugHookOnFail() {
      ate.ext.prog.javaflow.GlobalDebugHookOnFail.debugHookOnFail();
    }
  }
  
  public final ReadTestTable.Suite_TestTableReader_importTestTable importTestTable = new ReadTestTable.Suite_TestTableReader_importTestTable(this, true);
  
  public final ReadTestTable.Suite_TestTableWriter_exportTestTable exportTestTable = new ReadTestTable.Suite_TestTableWriter_exportTestTable(this, true);
  
  public void addChildren() {
    // add suites
    suites.add(importTestTable);
    suites.add(exportTestTable);
  }
  
  public ReadTestTable(final TestProgramContext context, final String name) {
    super(context, name, "crossconnect.common.ReadTestTable", "labsCrossConnect/src/crossconnect/common/ReadTestTable.flow");
    addChildren();
  }
  
  public ReadTestTable(final AbstractFlow parentTestflow, final String localName, final boolean isCalled) {
    super(parentTestflow, localName, "crossconnect.common.ReadTestTable", "labsCrossConnect/src/crossconnect/common/ReadTestTable.flow", isCalled);
    addChildren();
  }
  
  public void initialize() {
    super.initialize();
    
    // initialize chars
    
    // collect flow parameters
  }
  
  /**
   * Set up parameters of the subflow importTestTable
   */
  private void setupParametersOf_importTestTable(final ReadTestTable.Suite_TestTableReader_importTestTable it, final ReadTestTable ReadTestTable) {
    it._set_testTablePath("crossconnect/common/BasicLabTestTable.ods");
    it._set_limitCategory("QA");
    it._set_logLevelCategory("QA");
    it._set_errorLogPath("/tmp");
    it._set_forceImport(true);
  }
  
  /**
   * Set up parameters of the subflow exportTestTable
   */
  private void setupParametersOf_exportTestTable(final ReadTestTable.Suite_TestTableWriter_exportTestTable it, final ReadTestTable ReadTestTable) {
    it._set_limitCategory("QA");
    it._set_logLevelCategory("QA");
    it._set_outputFileName("/tmp/BasicLabExportTestTable.ods");
  }
  
  /**
   * Generated code of the execute method
   */
  protected void executeTestflow() {
    this.importTestTable.execute();
    this.exportTestTable.execute();
  }
  
  public void debugHook() {
    
  }
}
