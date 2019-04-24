import crossconnect.basicDigital.levels.FunctionalLevel;
import crossconnect.basicDigital.timings.FunctionalTimingEqn;
import crossconnect.basicDigital.timings.FunctionalTimingWtbx3;

// level settings
spec Functionalx3fast {
    vcc        = 1.4 V;
    IV_Swing   = 1.4 V;
    OV_Swing   = 0.4 V;

    // timing settings for eye diagram shmoos @ 1 GBit/sec
    per        = 1 ns;
    t_drive    = 0 ns;
    t_exp      = per * 0.7;

    setup digInOut allInputs+allOutputs {
        result.cyclePassFail.enabled = true;
    }
}
