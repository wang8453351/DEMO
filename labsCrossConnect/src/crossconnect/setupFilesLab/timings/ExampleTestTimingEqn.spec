import crossconnect.common.SignalGroups;

spec ExampleTestTimingEqn {
    set timingSet_1;

    var Time per;
    var Time t_drive;
    var Time t_exp;

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
