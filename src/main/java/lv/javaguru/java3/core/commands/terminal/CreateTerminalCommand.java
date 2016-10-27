package lv.javaguru.java3.core.commands.terminal;

import lv.javaguru.java3.core.commands.DomainCommand;

public class CreateTerminalCommand implements DomainCommand<CreateTerminalResult> {

    private Long vehicleId;
    private Long terminalTypeId;

    public CreateTerminalCommand(Long vehicleId, Long terminalTypeId) {
        this.vehicleId = vehicleId;
        this.terminalTypeId = terminalTypeId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public Long getTerminalTypeId() {
        return terminalTypeId;
    }
}
