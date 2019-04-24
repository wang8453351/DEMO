import crossconnect.common.SignalGroups;

spec ExampleTestLevel {
    set levelSet_1;

    var Voltage vcc;
    var Voltage IV_Swing;
    var Voltage OV_Swing;

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
