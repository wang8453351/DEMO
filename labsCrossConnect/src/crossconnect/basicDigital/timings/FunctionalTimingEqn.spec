import crossconnect.common.SignalGroups;
import crossconnect.common.SpecVariables;

spec FunctionalTimingEqn {
    set timingSet_1;

    setup digInOut allInputs {
        set timing timingSet_1 {
            period = per;
            d1 = t_drive;
        }
    }

    setup digInOut allOutputs {
        set timing timingSet_1 {
            period = per;
            d1 = 0 ns;
            r1 = t_exp;
        }
    }

}
