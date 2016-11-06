package lv.javaguru.java3.commands.terminals.termnals;

import lv.javaguru.java3.commands.DomainCommand;

public class GetTerminalCommand implements DomainCommand<GetTerminalResult> {

    private Long terminalId;

    public GetTerminalCommand(Long terminalId) {
        this.terminalId = terminalId;
    }

    public Long getTerminalId() {
        return terminalId;
    }
}
