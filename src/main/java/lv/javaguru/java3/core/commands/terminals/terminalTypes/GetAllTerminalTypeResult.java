package lv.javaguru.java3.core.commands.terminals.terminalTypes;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.TerminalTypeDTO;

import java.util.List;

public class GetAllTerminalTypeResult implements DomainCommandResult {

    private List<TerminalTypeDTO> terminalTypeDTOs;

    public GetAllTerminalTypeResult(List<TerminalTypeDTO> terminalTypeDTOs) {
        this.terminalTypeDTOs = terminalTypeDTOs;
    }

    public List<TerminalTypeDTO> getTerminalTypeDTOs() {
        return terminalTypeDTOs;
    }
}
