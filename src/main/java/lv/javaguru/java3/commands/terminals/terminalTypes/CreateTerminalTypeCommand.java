package lv.javaguru.java3.commands.terminals.terminalTypes;

import lv.javaguru.java3.commands.DomainCommand;

public class CreateTerminalTypeCommand implements DomainCommand<CreateTerminalTypeResult> {

    private String name;

    public CreateTerminalTypeCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
