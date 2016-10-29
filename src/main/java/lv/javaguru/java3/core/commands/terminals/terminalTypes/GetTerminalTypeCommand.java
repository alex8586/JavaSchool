package lv.javaguru.java3.core.commands.terminals.terminalTypes;

import lv.javaguru.java3.core.commands.DomainCommand;

public class GetTerminalTypeCommand implements DomainCommand<GetTerminalTypeResult> {

    private Long id;

    public GetTerminalTypeCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
