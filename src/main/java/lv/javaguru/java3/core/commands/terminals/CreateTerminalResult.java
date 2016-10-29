package lv.javaguru.java3.core.commands.terminals;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;

public class CreateTerminalResult implements DomainCommandResult{

    private TerminalDTO terminalDTO;

    public CreateTerminalResult(TerminalDTO terminalDTO) {
        this.terminalDTO = terminalDTO;
    }

    public TerminalDTO getTerminalDTO() {
        return terminalDTO;
    }
}
