package lv.javaguru.java3.commands.terminals.terminalTypes;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.dto.TerminalTypeDTO;
import lv.javaguru.java3.services.terminals.terminal_type.TerminalTypeFactory;
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
}
