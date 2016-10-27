package lv.javaguru.java3.core.commands.terminal;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;

import java.util.List;

public class GetAllTerminalResult implements DomainCommandResult{

    private List<TerminalDTO> terminalDTOs;

    public List<TerminalDTO> getTerminalDTOs() {
        return terminalDTOs;
    }

    public GetAllTerminalResult(List<TerminalDTO> terminalDTOs) {

        this.terminalDTOs = terminalDTOs;
    }
}
