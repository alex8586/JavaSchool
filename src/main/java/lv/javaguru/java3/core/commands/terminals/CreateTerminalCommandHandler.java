package lv.javaguru.java3.core.commands.terminals;

import lv.javaguru.java3.core.database.TerminalTypeDAO;
import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;
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

    @Autowired
    private VehicleDAO vehicleDAO;
    @Autowired
    private TerminalTypeDAO terminalTypeDAO;

    @Override
    public CreateTerminalResult execute(CreateTerminalCommand command) {
        Vehicle vehicle = vehicleDAO.getById(command.getVehicleId());
        TerminalType terminalType = terminalTypeDAO.getById(command.getTerminalTypeId());
        System.out.println(vehicle);
        System.out.println(terminalType);

        Terminal terminal = terminalFactory.create(vehicle,terminalType);
        TerminalDTO terminalDTO = terminalConverter.convert(terminal);
        return new CreateTerminalResult(terminalDTO);
    }

    @Override
    public Class getCommandType() {
        return CreateTerminalCommand.class;
    }
}
