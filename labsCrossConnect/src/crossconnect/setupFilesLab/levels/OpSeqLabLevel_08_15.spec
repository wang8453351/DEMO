import crossconnect.common.SignalGroups;
import crossconnect.common.SpecVariables;

spec OpSeqLabLevel_08_15 {
    set levelSet_08_15;

    setup digInOut gD08_D15 + gR08_R15 {
        connect = true;
        set level levelSet_08_15 {
            vil = vcc / 2 - IV_Swing / 2;
            vih = vcc / 2 + IV_Swing / 2;
            vol = vcc / 2 - OV_Swing / 2;
            voh = vcc / 2 + OV_Swing / 2;
        }
    }

}
