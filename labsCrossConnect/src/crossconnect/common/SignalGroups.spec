/**
 * Signal groups are defined in the measurement specification.
 * A signal group is a collection of signals that are to be treated in a similar way.
 *
 * @see "Specification file reference in TDC (Topic 244401)"
 *
 */
spec SignalGroups {
    group driveGroup   = D00 + D01 + D02 + D03 + D04 + D05 + D06 + D07 + D08 + D09 + D10 + D11 + D12 + D13 + D14 + D15;
    group receiveGroup = R00 + R01 + R02 + R03 +
                         R04 + R05 + R06 + R07 +
                         R08 + R09 + R10 + R11 +
                         R12 + R13 + R14 + R15;
    // define group by another group // does not work CR-92047
    group allInputs    = driveGroup;
    group allOutputs   = receiveGroup;
    group allIOs       = driveGroup + receiveGroup;
    group evenInputs   = D00 + D02 + D04 + D06 +
                         D08 + D10 + D12 + D14;
    // define group by removing signals from a larger group
    group oddInputs    = allInputs - evenInputs;
    // define group for partial sequencer runs
    group gD00_D03     = D00 + D01 + D02 + D03;
    group gR00_R03     = R00 + R01 + R02 + R03;
    group gD04_D07     = D04 + D05 + D06 + D07;
    group gR04_R07     = R04 + R05 + R06 + R07;
    group gD08_D11     = D08 + D09 + D10 + D11;
    group gR08_R11     = R08 + R09 + R10 + R11;
    group gD12_D15     = D12 + D13 + D14 + D15;
    group gR12_R15     = R12 + R13 + R14 + R15;
    group gD00_D07     = gD00_D03 + gD04_D07;
    group gR00_R07     = gR00_R03 + gR04_R07;
    group gD08_D15     = gD08_D11 + gD12_D15;
    group gR08_R15     = gR08_R11 + gR12_R15;


}
