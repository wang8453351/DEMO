import crossconnect.common.SignalGroups;
import crossconnect.common.SpecVariables;

spec FunctionalLevel {
    set levelSet_1;

    setup digInOut allIOs {
        connect = true;
        set level levelSet_1 {
            vil = vcc/2 - IV_Swing/2;
            vih = vcc/2 + IV_Swing/2;
            vol = vcc/2 - OV_Swing/2;
            voh = vcc/2 + OV_Swing/2;
        }
    }

}
