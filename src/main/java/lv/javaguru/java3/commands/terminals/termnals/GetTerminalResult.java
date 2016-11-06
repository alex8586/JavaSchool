package lv.javaguru.java3.commands.terminals.termnals;

import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.TerminalDTO;


public class GetTerminalResult implements DomainCommandResult{

    private TerminalDTO terminalDTO;

    public GetTerminalResult(TerminalDTO terminalDTO) {
        this.terminalDTO = terminalDTO;
    }

    public TerminalDTO getTerminalDTO() {
        return terminalDTO;
    }
}
