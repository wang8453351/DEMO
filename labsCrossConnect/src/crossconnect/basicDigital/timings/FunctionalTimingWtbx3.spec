import crossconnect.common.SignalGroups;

spec FunctionalTimingWtbx3 {
    setup digInOut allInputs {
        wavetable wvt3 {
            xModes = 3 {
                0: d1:0;
                1: d1:1;
            }
        }
    }

    setup digInOut allOutputs {
        wavetable wvt3 {
            xModes = 3 {
                L: d1:Z r1:L;
                H: d1:Z r1:H;
                X: d1:Z r1:X;
            }
        }
    }
}
