package lv.javaguru.java3.commands.terminals.termnals;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.api.termnals.TerminalTypeDAO;
import lv.javaguru.java3.api.vehicles.VehicleDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.services.terminals.terminals.TerminalFactory;
import lv.javaguru.java3.dto.TerminalDTO;
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
