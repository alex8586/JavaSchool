package lv.javaguru.java3.core.commands.terminal;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.terminal.TerminalFactory;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateTerminalCommandHandler
        implements DomainCommandHandler<CreateTerminalCommand, CreateTerminalResult> {

    @Autowired
    private TerminalFactory terminalFactory;
    @Autowired
    private TerminalConverter terminalConverter;

    @Override
    public CreateTerminalResult execute(CreateTerminalCommand command) {
        Terminal terminal = terminalFactory.create(command.getVehicle(),
                                                    command.getTerminalType());
        TerminalDTO terminalDTO = terminalConverter.convert(terminal);
        return new CreateTerminalResult(terminalDTO);
    }

    @Override
    public Class getCommandType() {
        return CreateTerminalCommand.class;
    }
}
