package lv.javaguru.java3.core.commands.terminals;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.terminal.TerminalService;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;
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

    @Override
    public Class getCommandType() {
        return GetTerminalCommand.class;
    }
}
