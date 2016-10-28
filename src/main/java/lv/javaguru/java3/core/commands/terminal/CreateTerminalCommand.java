package lv.javaguru.java3.core.commands.terminal;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;

public class CreateTerminalCommand implements DomainCommand<CreateTerminalResult> {

    private Vehicle vehicle;
    private TerminalType terminalType;

    public CreateTerminalCommand(Vehicle vehicle, TerminalType terminalType) {
        this.vehicle = vehicle;
        this.terminalType = terminalType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public TerminalType getTerminalType() {
        return terminalType;
    }
}
