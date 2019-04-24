import crossconnect.common.SignalGroups;

spec DcViLab {
    // declarations
    set timingSet_1;
    set levelSet_1;
    // add action declarations here
    action dcVIVfIm1;
    action dcVIVfIm2;
    action dcVIVfIm3;
    action dcVIIfVm1;
    action dcVIIfVm2;
    action dcVIIfVm3;

    // variables
    var Time per;
    var Time t_drive;
    var Time t_exp;
    var Voltage vcc;
    var Voltage IV_Swing;
    var Voltage OV_Swing;

    // timing settings
    per        = 10e-06 s;
    t_drive    = per / 4;
    t_exp      = per - 2 ns;

    // level settings
    vcc        = 1.4 V;
    IV_Swing   = 1.4 V;
    OV_Swing   = 0.4 V;

    // dcVI settings
    setup dcVI D00 + D02 + D03{
        // add actions here
        action vforceImeas dcVIVfIm1{
            forceValue = 1.0V;
            waitTime = 1.5ms;
            irange = 0.1uA;
        }
         action vforceImeas dcVIVfIm2{
            forceValue = 1.0V;
            waitTime = 1.5ms;
            irange = 0.1uA;
        }
         action vforceImeas dcVIVfIm3{
            forceValue = 1.0V;
            waitTime = 1.5ms;
            irange = 0.1uA;
        }
    }

    setup dcVI R00 + R02 +R03 {
        // add actions here
        action iforceVmeas dcVIIfVm1{
            forceValue = 0.01 uA;
            waitTime = 1.5 ms;
            vclampHigh = 1.5V;
            vclampLow = 0V;
        }
        action iforceVmeas dcVIIfVm2{
            forceValue = 0.01 uA;
            waitTime = 1.5 ms;
            vclampHigh = 1.5V;
            vclampLow = 0V;
        }
        action iforceVmeas dcVIIfVm3{
            forceValue = 0.01 uA;
            waitTime = 1.5 ms;
            vclampHigh = 1.5V;
            vclampLow = 0V;
        }
    }
    setup digInOut D01+R01{
        wavetable default {
            xModes = 1;
            0: d1:0;
            1: d1:1;
            Z: d1:Z;
            L: d1:Z r1:L;
            H: d1:Z r1:H;
            X: d1:Z r1:X;
        }
        set timing timingSet_1{
            period  =  per;
            d1 =  t_drive;
            r1 =  per/2;
        }
        connect = true;
        set level levelSet_1{
            vil = vcc/2 - IV_Swing/2;
            vih = vcc/2 + IV_Swing/2;
            vol = vcc/2 - OV_Swing/2;
            voh = vcc/2 + OV_Swing/2;

        }
    }

    // add digital signals D01 and R01 here


}
