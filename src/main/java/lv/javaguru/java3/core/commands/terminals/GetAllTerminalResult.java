package lv.javaguru.java3.core.commands.terminals;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.dto.TerminalDTO;
import java.util.List;

public class GetAllTerminalResult implements DomainCommandResult{

    private List<TerminalDTO> terminalDTOs;

    public GetAllTerminalResult(List<TerminalDTO> terminalDTOs) {
        this.terminalDTOs = terminalDTOs;
    }

    public List<TerminalDTO> getTerminalDTOs() {
        return terminalDTOs;
    }
}
