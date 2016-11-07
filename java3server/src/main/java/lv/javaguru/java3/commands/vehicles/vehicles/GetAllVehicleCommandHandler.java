package lv.javaguru.java3.commands.vehicles.vehicles;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.dto.VehicleDTO;
import lv.javaguru.java3.services.vehicles.vehicles.VehicleService;
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
}
