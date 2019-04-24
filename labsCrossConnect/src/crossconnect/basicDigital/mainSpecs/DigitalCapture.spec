import crossconnect.basicDigital.levels.FunctionalLevel;
import crossconnect.basicDigital.timings.FunctionalTimingEqn;
import crossconnect.basicDigital.timings.DigitalCaptureTimingWtb;

spec DigitalCapture {
    // level settings
    vcc        = 1.4 V;
    IV_Swing   = 1.4 V;
    OV_Swing   = 0 V;

    // timing settings
    per        = 200 ns;
    t_drive    = per / 4;
    t_exp      = per - 2 ns;

    setup digInOut allInputs {
        result.cyclePassFail.enabled = true;
    }

     setup digInOut allOutputs {
        result.capture.enabled = true;
        // Other result modes must be disabled:
        //        result.cyclePassFail.enabled = true;
        //        result.cycleReceiveData.enabled = true;
    }
}

