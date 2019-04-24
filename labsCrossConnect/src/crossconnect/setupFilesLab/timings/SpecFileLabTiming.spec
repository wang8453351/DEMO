import crossconnect.common.SignalGroups;

spec SpecFileLabTiming {
    set timingSet_1;
    var Time per;
    var Time t_drive;
    var Time t_exp;

    setup digInOut gD00_D03 + gR00_R03 {
        set timing timingSet_1 {
            period = per;
            d1 = t_drive;
            r1 = t_exp;
        }
        //
        // Lab : Add default wavetable with xModes = 1, later change it to xModes = 2
        //
        wavetable default {
            xModes = 2;
            0: d1:0;
            1: d1:1;
            Z: d1:Z;
            L: d1:Z r1:L;
            H: d1:Z r1:H;
            X: d1:Z r1:X;
        }

    }

    setup digInOut gD04_D07 + gR04_R07 {
        set timing timingSet_1 {
            period = per*0.8; // Lab: change period here
            d1 = t_drive;
            r1 = t_exp;
        }
        //
        // Lab : Add default wavetable with xModes = 1
        //
    wavetable default {
        xModes = 1;
        0: d1:0;
        1: d1:1;
        Z: d1:Z;
        L: d1:Z r1:L;
        H: d1:Z r1:H;
        X: d1:Z r1:X;
    }

    }

    setup digInOut gD08_D15 + gR08_R15 {
        set timing timingSet_1 {
            period = per*1.2; // Lab: change period here
            d1 = t_drive;
            r1 = t_exp;
        }
        //
        // Lab : Add default wavetable with xModes = 1, afterwards CTRL-SHIFT-F
        //
        wavetable default {
            xModes = 1;
            0: d1:0;
            1: d1:1;
            Z: d1:Z;
            L: d1:Z r1:L;
            H: d1:Z r1:H;
            X: d1:Z r1:X;
        }

    }

}
