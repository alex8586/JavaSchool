package lv.javaguru.java3.core.commands.terminals;

import lv.javaguru.java3.core.commands.DomainCommand;

public class GetTerminalCommand implements DomainCommand<GetTerminalResult> {

    private Long terminalId;

    public GetTerminalCommand(Long terminalId) {
        this.terminalId = terminalId;
    }

    public Long getTerminalId() {
        return terminalId;
    }
}
