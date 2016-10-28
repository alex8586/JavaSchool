package lv.javaguru.java3.core.commands.terminal_type;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.TerminalTypeDTO;

public class CreateTerminalTypeResult implements DomainCommandResult{

    private TerminalTypeDTO terminalTypeDTO;

    public CreateTerminalTypeResult(TerminalTypeDTO terminalTypeDTO) {
        this.terminalTypeDTO = terminalTypeDTO;
    }

    public TerminalTypeDTO getTerminalTypeDTO() {
        return terminalTypeDTO;
    }
}
