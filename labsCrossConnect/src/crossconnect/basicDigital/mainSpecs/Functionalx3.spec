import crossconnect.basicDigital.levels.FunctionalLevel;
import crossconnect.basicDigital.timings.FunctionalTimingEqn;
import crossconnect.basicDigital.timings.FunctionalTimingWtbx3;

// level settings
spec Functionalx3 {
    vcc        = 1.4 V;
    IV_Swing   = 1.4 V;
    OV_Swing   = 0.4 V;

    // timing settings
    per        = 200 ns;
    t_drive    = per / 4;
    t_exp      = per - 2 ns;

    setup digInOut allInputs+allOutputs {
        result.cyclePassFail.enabled = true;
    }
}
