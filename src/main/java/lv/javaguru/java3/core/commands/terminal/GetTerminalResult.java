package lv.javaguru.java3.core.commands.terminal;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;

public class GetTerminalResult implements DomainCommandResult{

    private TerminalDTO terminalDTO;

    public GetTerminalResult(TerminalDTO terminalDTO) {
        this.terminalDTO = terminalDTO;
    }

    public TerminalDTO getTerminalDTO() {
        return terminalDTO;
    }
}
