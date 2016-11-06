package lv.javaguru.java3.commands.terminals.termnals;

import lv.javaguru.java3.commands.DomainCommand;

public class CreateTerminalCommand implements DomainCommand<CreateTerminalResult> {

    private long vehicleId;
    private long terminalTypeId;

    public CreateTerminalCommand(long vehicleId, long terminalTypeId) {
        this.vehicleId = vehicleId;
        this.terminalTypeId = terminalTypeId;
    }

    public long getVehicleId() {
        return vehicleId;
    }
    public long getTerminalTypeId() {
        return terminalTypeId;
    }
}
