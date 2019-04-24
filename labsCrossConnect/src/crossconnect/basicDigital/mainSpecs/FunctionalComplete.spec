// define groups by signals of DUT board description file
spec FunctionalComplete {
    group driveGroup   = D00 + D01 + D02 + D03 + D04 + D05 + D06 + D07 + D08 + D09 + D10 + D11 + D12 + D13 + D14 + D15;
    group receiveGroup = R00 + R01 + R02 + R03 +
                         R04 + R05 + R06 + R07 +
                         R08 + R09 + R10 + R11 +
                         R12 + R13 + R14 + R15;
    // define groups by other groups
    group allInputs    = driveGroup;
    group allOutputs   = receiveGroup;

    // level settings
    var Voltage vcc      = 1.4 V;
    var Voltage IV_Swing = 1.4 V;
    var Voltage OV_Swing = 0.4 V;

    // timing settings
    var Time per         = 200ns;
    var Time t_drive     = per / 4;
    var Time t_exp       = per - 2 ns;

    set levelSet_1;
    set timingSet_1;
    action vfim;
    action ifvm;

    // configure signals for the test
    setup digInOut allInputs {
        set level levelSet_1 {
            vil = vcc/2 - IV_Swing/2;
            vih = vcc/2 + IV_Swing/2;
            vol = vcc/2 - OV_Swing/2;
            voh = vcc/2 + OV_Swing/2;
        }
        set timing timingSet_1 {
            period = per;
            d1 = t_drive;
        }
        wavetable wvt1 {
            xModes = 1 {
                0: d1:0;
                1: d1:1;
            }
        }
        // action will be not used during execution
        action vforceImeas vfim {
            forceValue = 1V;
            waitTime = 1.5ms;
            irange = 0.1uA;
        }
        connect = true;
        result.cyclePassFail.enabled = false;
    }

    setup digInOut allOutputs {
        set level levelSet_1 {
            vil = vcc/2 - IV_Swing/2;
            vih = vcc/2 + IV_Swing/2;
            vol = vcc/2 - OV_Swing/2;
            voh = vcc/2 + OV_Swing/2;
        }
        set timing timingSet_1 {
            period = per;
            d1 = 0 ns;
            r1 = t_exp;
        }
        wavetable wvt1 {
            xModes = 1 {
                L: d1:Z r1:L;
                H: d1:Z r1:H;
                X: d1:Z r1:X;
            }
        }
        // action will be not used during execution
        action iforceVmeas ifvm {
            limits.high = 0.91V;
            limits.low = 0.89V;
            forceValue = 0.01uA;
            waitTime = 1.5ms;
            vclampHigh = 1.5V;
            vclampLow = 0.0V;
        }
        connect = true;
        result.cyclePassFail.enabled = true;
    }

}
