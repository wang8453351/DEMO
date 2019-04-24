import crossconnect.common.SignalGroups;

spec FunctionalTimingWtb {
    setup digInOut allInputs {
        wavetable wvt1 {
            xModes = 1 {
                0: d1:0;
                1: d1:1;
            }
        }
    }

    setup digInOut allOutputs {
        wavetable wvt1 {
            xModes = 1 {
                L: d1:Z r1:L;
                H: d1:Z r1:H;
                X: d1:Z r1:X;
            }
        }
    }
}
