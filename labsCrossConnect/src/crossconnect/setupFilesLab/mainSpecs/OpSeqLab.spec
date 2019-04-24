import crossconnect.setupFilesLab.levels.OpSeqLabLevel_00_07;
import crossconnect.setupFilesLab.timings.OpSeqLabTiming_00_07x1;
import crossconnect.setupFilesLab.levels.OpSeqLabLevel_08_15;
import crossconnect.setupFilesLab.timings.OpSeqLabTiming_08_15x1;

//
// Lab Instruction:
// 	* Import level and timing spec files for 08-15 pins
//

spec OpSeqLab {
    // for level set properties
    vcc        = 1.4 V;
    IV_Swing   = 1.4 V;
    OV_Swing   = 0.4 V;

    // for timing set properties
    per        = 200 ns;
    t_drive    = per / 4;
    t_exp      = per - 2 ns;

    //
    // Lab : Add signal groups gD08_D15 and gR08_R15
    //
    setup digInOut gD00_D03 + gR00_R03 + gD04_D07 + gR04_R07 + gD08_D15 + gR08_R15 {
        result.cyclePassFail.enabled = true;
    }
}
