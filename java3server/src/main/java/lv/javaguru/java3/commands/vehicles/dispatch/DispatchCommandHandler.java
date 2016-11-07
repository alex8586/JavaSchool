package lv.javaguru.java3.commands.vehicles.dispatch;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.dto.DispatchDTO;
import lv.javaguru.java3.services.terminals.terminals.TerminalService;
import lv.javaguru.java3.services.vehicles.vehicles.VehicleService;
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
}
