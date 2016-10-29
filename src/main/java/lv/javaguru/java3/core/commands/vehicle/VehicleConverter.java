package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.commands.routes.RouteConverter;
import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.integrations.rest.dto.VehicleDTO;
import lv.javaguru.java3.integrations.rest.dto.VehicleDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VehicleConverter {

    @Autowired
    RouteConverter routeConverter;

    public VehicleDTO convert(Vehicle vehicle){
        System.out.println(vehicle);
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
