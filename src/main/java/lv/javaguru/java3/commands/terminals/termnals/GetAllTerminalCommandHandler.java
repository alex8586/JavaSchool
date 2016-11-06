package lv.javaguru.java3.commands.terminals.termnals;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.services.terminals.terminals.TerminalService;
import lv.javaguru.java3.dto.TerminalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllTerminalCommandHandler
        implements DomainCommandHandler<GetAllTerminalCommand, GetAllTerminalResult>{

    @Autowired
    private TerminalConverter terminalConverter;
    @Autowired
    private TerminalService terminalService;

    @Override
    public GetAllTerminalResult execute(GetAllTerminalCommand command) {
        List<Terminal> terminalList = terminalService.getAll();
        List<TerminalDTO> terminalDTOs = terminalConverter.convert(terminalList);
        return new GetAllTerminalResult(terminalDTOs);
    }

    @Override
    public Class getCommandType() {
        return GetAllTerminalCommand.class;
    }
}
