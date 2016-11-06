package lv.javaguru.java3.commands.terminals.termnals;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.services.terminals.terminals.TerminalService;
import lv.javaguru.java3.dto.TerminalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetTerminalCommandHandler
        implements DomainCommandHandler<GetTerminalCommand, GetTerminalResult>{

    @Autowired
    private TerminalService terminalService;
    @Autowired
    private TerminalConverter terminalConverter;

    @Override
    public GetTerminalResult execute(GetTerminalCommand command) {
        Terminal terminal = terminalService.get(command.getTerminalId());
        TerminalDTO terminalDTO = terminalConverter.convert(terminal);
        return new GetTerminalResult(terminalDTO);
    }
}
