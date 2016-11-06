package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.vehicle.VehicleService;
import lv.javaguru.java3.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllVehicleCommandHandler
        implements DomainCommandHandler <GetAllVehicleCommand, GetAllVehicleResult>{

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private VehicleConverter vehicleConverter;

    @Override
    public GetAllVehicleResult execute(GetAllVehicleCommand command) {
        List<Vehicle> vehicles = vehicleService.getAll();
        List<VehicleDTO> vehicleDTOs = vehicleConverter.convert(vehicles);
        return new GetAllVehicleResult(vehicleDTOs);
    }

    @Override
    public Class getCommandType() {
        return GetAllVehicleCommand.class;
    }
}
