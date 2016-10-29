package lv.javaguru.java3.core.commands.terminalTypes;

import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.terminal_type.TerminalTypeService;
import lv.javaguru.java3.integrations.rest.dto.TerminalTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetTerminalTypeCommandHandler
        implements DomainCommandHandler <GetTerminalTypeCommand, GetTerminalTypeResult>{

    @Autowired
    private TerminalTypeService terminalTypeService;
    @Autowired
    private TerminalTypeConverter terminalTypeConverter;

    @Override
    public GetTerminalTypeResult execute(GetTerminalTypeCommand command) {
        TerminalType terminalType = terminalTypeService.get(command.getId());
        TerminalTypeDTO terminalTypeDTO = terminalTypeConverter.convert(terminalType);
        return new GetTerminalTypeResult(terminalTypeDTO);
    }

    @Override
    public Class getCommandType() {
        return GetTerminalTypeCommand.class;
    }
}
