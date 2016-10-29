package lv.javaguru.java3.core.commands.terminalTypes;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.TerminalTypeDTO;

public class GetTerminalTypeResult implements DomainCommandResult{

    private TerminalTypeDTO terminalTypeDTO;

    public GetTerminalTypeResult(TerminalTypeDTO terminalTypeDTO) {
        this.terminalTypeDTO = terminalTypeDTO;
    }

    public TerminalTypeDTO getTerminalTypeDTO() {
        return terminalTypeDTO;
    }
}