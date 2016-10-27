package lv.javaguru.java3.core.commands.terminal_type;

import lv.javaguru.java3.core.commands.terminal.CreateTerminalCommand;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.terminal_type.TerminalTypeFactory;
import lv.javaguru.java3.integrations.rest.dto.TerminalTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateTerminalTypeCommandHandler
        implements DomainCommandHandler <CreateTerminalTypeCommand, CreateTerminalTypeResult>{

    @Autowired
    private TerminalTypeFactory terminalTypeFactory;
    @Autowired
    private TerminalTypeConverter terminalTypeConverter;

    @Override
    public CreateTerminalTypeResult execute(CreateTerminalTypeCommand command) {
        TerminalType terminalType = terminalTypeFactory.create(command.getName());
        TerminalTypeDTO terminalTypeDTO = terminalTypeConverter.convert(terminalType);
        return new CreateTerminalTypeResult(terminalTypeDTO);
    }

    @Override
    public Class getCommandType() {
        return CreateTerminalCommand.class;
    }
}
