package lv.javaguru.java3.core.commands.vehicle.dispatch;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.terminal.TerminalService;
import lv.javaguru.java3.core.services.vehicle.VehicleService;
import lv.javaguru.java3.dto.DispatchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DispatchCommandHandler implements DomainCommandHandler<DispatchCommand, DispatchResult> {

    @Autowired
    TerminalService terminalService;

    @Autowired
    VehicleService vehicleService;

    @Autowired
    DispatchConverter dispatchConverter;


    @Override
    public DispatchResult execute(DispatchCommand command) {
        Terminal terminal = terminalService.get(command.getTerminalId());
        if(terminal.getTerminalType().getId() != 3)
            throw new IllegalArgumentException();

        Vehicle vehicle = terminal.getVehicle();
        Trip oldTrip = vehicle.getCurrentTrip();
        Trip newTrip = vehicleService.revolveTrip(vehicle);
        
        DispatchDTO dispatchDTO = dispatchConverter.convert(oldTrip,newTrip);
        return new DispatchResult(dispatchDTO);
    }

    @Override
    public Class getCommandType() {
        return DispatchCommand.class;
    }
}
