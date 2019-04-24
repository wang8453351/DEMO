spec DigInOutDC {

    //  declarations
    set timingSet_1;
    set levelSet_1;
    // add action declarations here
    action digInOutVfIm;
    action digInOutIfVm;

    // variables
    var Time per;
    var Time t_drive;
    var Time t_exp;
    var Voltage vcc;
    var Voltage IV_Swing;
    var Voltage OV_Swing;

    group subset = D00 + R00;

    // timing settings
    per        = 10e-06 s;
    t_drive    = per / 4;
    t_exp      = per - 2 ns;

    // level settings
    vcc        = 1.4 V;
    IV_Swing   = 1.4 V;
    OV_Swing   = 0.4 V;

    setup digInOut D00 {

        // add action here
        action vforceImeas digInOutVfIm {
            forceValue = 1 V;
            vrange = 1 V;
            averages = 1;
            irange = 1 mA;
            waitTime = 1.5 ms;

        }

        wavetable default {
            xModes = 1;
            0: d1:0;
            1: d1:1;
            Z: d1:Z;
            L: d1:Z r1:L;
            H: d1:Z r1:H;
            X: d1:Z r1:X;
        }
        set timing timingSet_1 { // Timing Set
            period = per;
            d1 = t_drive;
            r1 = per/2;
        }
        connect = true;
        set level levelSet_1 { // Level Set
            vil = vcc/2 - IV_Swing/2;
            vih = vcc/2 + IV_Swing/2;
            vol = vcc/2 - OV_Swing/2;
            voh = vcc/2 + OV_Swing/2;
        }
     }


    setup digInOut R00 {

        // add action here
        action iforceVmeas digInOutIfVm {
            limits.high = 1.1V;
            limits.low 	= 0.99V;
            forceValue = 0.01uA;
            waitTime   = 1.5ms;
            vclampHigh = 1.5V;
            vclampLow = 0V;
        }
        wavetable default {
            xModes = 1;
            0: d1:0;
            1: d1:1;
            Z: d1:Z;
            L: d1:Z r1:L;
            H: d1:Z r1:H;
            X: d1:Z r1:X;
        }
       set timing timingSet_1 { // Timing Set
            period = per;
            d1 = t_drive;
            r1 = per/2;
        }
        connect = true;
        set level levelSet_1 { // Level Set
            vil = vcc/2 - IV_Swing/2;
            vih = vcc/2 + IV_Swing/2;
            vol = vcc/2 - OV_Swing/2;
            voh = vcc/2 + OV_Swing/2;
        }
    }
}
