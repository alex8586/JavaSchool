package lv.javaguru.java3.core.commands.terminals.terminalTypes;

import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.terminal_type.TerminalTypeService;
import lv.javaguru.java3.dto.TerminalTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllTerminalTypeCommandHandler
        implements DomainCommandHandler<GetAllTerminalTypeCommand, GetAllTerminalTypeResult> {

    @Autowired
    private TerminalTypeService terminalTypeService;
    @Autowired
    private TerminalTypeConverter terminalTypeConverter;

    @Override
    public GetAllTerminalTypeResult execute(GetAllTerminalTypeCommand command) {
        List<TerminalType> terminalTypes = terminalTypeService.getAll();
        List<TerminalTypeDTO> terminalTypeDTOs = terminalTypeConverter.convert(terminalTypes);
        return new GetAllTerminalTypeResult(terminalTypeDTOs);
    }

    @Override
    public Class getCommandType() {
        return GetAllTerminalTypeCommand.class;
    }
}
