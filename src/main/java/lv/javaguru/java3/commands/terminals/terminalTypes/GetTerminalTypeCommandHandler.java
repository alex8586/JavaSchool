package lv.javaguru.java3.commands.terminals.terminalTypes;


import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.services.terminals.terminal_type.TerminalTypeService;
import lv.javaguru.java3.dto.TerminalTypeDTO;
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

}
