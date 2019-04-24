import crossconnect.common.SignalGroups;
import crossconnect.common.SpecVariables;

spec OpSeqLabTiming_08_15x1 {
    set timingSet_08_15;

    setup digInOut gD08_D15 + gR08_R15 {
        set timing timingSet_08_15 {
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
