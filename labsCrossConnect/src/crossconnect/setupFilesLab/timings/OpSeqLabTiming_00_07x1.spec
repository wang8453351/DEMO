import crossconnect.common.SignalGroups;
import crossconnect.common.SpecVariables;

spec OpSeqLabTiming_00_07x1 {
    set timingSet_00_07;

    setup digInOut gD00_D03 + gR00_R03 + gD04_D07 + gR04_R07 {
        set timing timingSet_00_07 {
            period = per;
            d1 = t_drive;
            r1 = t_exp;
        }
        wavetable default {
            xModes = 1;
            0 : d1 : 0;
            1 : d1 : 1;
            Z : d1 : Z;
            L : d1 : Z r1 : L;
            H : d1 : Z r1 : H;
            X : d1 : Z r1 : X;
        }
    }

}
