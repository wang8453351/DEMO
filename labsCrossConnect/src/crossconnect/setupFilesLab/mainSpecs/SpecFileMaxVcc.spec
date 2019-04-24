import crossconnect.setupFilesLab.levels.ExampleTestLevel;
import crossconnect.setupFilesLab.timings.ExampleTestTimingEqn;
import crossconnect.setupFilesLab.timings.ExampleTestTimingWtb;

spec SpecFileMaxVcc {
    // level settings
    vcc        = 1.8 V;
    IV_Swing   = 1.8 V;
    OV_Swing   = 0.5 V;

    // timing settings
    per        = 200 ns;
    t_drive    = per / 4;
    t_exp      = per - 2 ns;

    setup digInOut allInputs+allOutputs {
        result.cyclePassFail.enabled = true;
    }
}
