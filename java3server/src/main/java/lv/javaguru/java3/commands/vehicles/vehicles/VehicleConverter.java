package lv.javaguru.java3.commands.vehicles.vehicles;

import lv.javaguru.java3.commands.vehicles.routes.RouteConverter;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.dto.VehicleDTO;
import lv.javaguru.java3.dto.builders.VehicleDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class VehicleConverter {

    @Autowired
    RouteConverter routeConverter;

    public VehicleDTO convert( Vehicle vehicle){
        if(vehicle == null)
            return null;
        return VehicleDTOBuilder.createVehicleDTO()
                .withId(vehicle.getId())
                .withCarCode(vehicle.getCarCode())
                .withRouteDTO(routeConverter.convert(vehicle.getRoute()))
                .build();
    }

    public List<VehicleDTO> convert(List<Vehicle> vehicles){
        return vehicles.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

}
