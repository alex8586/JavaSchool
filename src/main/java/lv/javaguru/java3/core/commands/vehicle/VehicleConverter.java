package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.integrations.rest.dto.VehicleDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static lv.javaguru.java3.integrations.rest.dto.VehicleDTOBuilder.createVehicleDTO;

@Component
public class VehicleConverter {

    public VehicleDTO convert(Vehicle vehicle){
        return createVehicleDTO()
                .withId(vehicle.getId())
                .withCarCode(vehicle.getCarCode())
                .withRoute(vehicle.getRoute())
                .build();
    }

    public List<VehicleDTO> convert(List<Vehicle> vehicles){
        return vehicles.stream().map(vehicle -> convert(vehicle)).collect(Collectors.toList());
    }
}
