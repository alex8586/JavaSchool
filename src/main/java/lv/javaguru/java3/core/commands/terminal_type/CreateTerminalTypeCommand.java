package lv.javaguru.java3.core.commands.terminal_type;

import lv.javaguru.java3.core.commands.DomainCommand;

public class CreateTerminalTypeCommand implements DomainCommand<CreateTerminalTypeResult> {

    private String name;

    public CreateTerminalTypeCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
