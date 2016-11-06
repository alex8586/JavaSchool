package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.vehicle.VehicleService;
import lv.javaguru.java3.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetVehicleCommandHandler
        implements DomainCommandHandler <GetVehicleCommand, GetVehicleResult>{

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private VehicleConverter vehicleConverter;

    @Override
    public GetVehicleResult execute(GetVehicleCommand command) {
        Vehicle vehicle = vehicleService.get(command.getId());
        VehicleDTO vehicleDTO = vehicleConverter.convert(vehicle);
        return new GetVehicleResult(vehicleDTO);
    }

    @Override
    public Class getCommandType() {
        return GetVehicleCommand.class;
    }
}
