package lv.javaguru.java3.commands.vehicles.vehicles;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.dto.VehicleDTO;
import lv.javaguru.java3.services.vehicles.vehicles.VehicleService;
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
}
