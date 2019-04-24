import crossconnect.common.SignalGroups;
import crossconnect.common.SpecVariables;

spec OpSeqLabLevel_00_07 {
    set levelSet_00_07;

    setup digInOut gD00_D03 + gR00_R03 + gD04_D07 + gR04_R07 {
        connect = true;
        set level levelSet_00_07 {
            vil = vcc / 2 - IV_Swing / 2;
            vih = vcc / 2 + IV_Swing / 2;
            vol = vcc / 2 - OV_Swing / 2;
            voh = vcc / 2 + OV_Swing / 2;
        }
    }

}
