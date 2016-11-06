package lv.javaguru.java3.core.commands.terminals.terminalTypes;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.dto.TerminalTypeDTO;


public class GetTerminalTypeResult implements DomainCommandResult{
    private TerminalTypeDTO terminalTypeDTO;
    public GetTerminalTypeResult(TerminalTypeDTO terminalTypeDTO) {
        this.terminalTypeDTO = terminalTypeDTO;
    }
    public TerminalTypeDTO getTerminalTypeDTO() {
        return terminalTypeDTO;
    }
}
