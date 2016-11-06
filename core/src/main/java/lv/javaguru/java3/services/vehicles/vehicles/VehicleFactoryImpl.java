package lv.javaguru.java3.services.vehicles.vehicles;

import lv.javaguru.java3.api.vehicles.VehicleDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.domain.vehicles.VehicleBuilder.createVehicle;

@Component
public class VehicleFactoryImpl implements VehicleFactory {

    @Autowired
    private VehicleDAO vehicleDAO;

    @Override
    public Vehicle create(String carCode, Route route) {
        Vehicle vehicle = createVehicle()
                .withCarCode(carCode)
                .withRoute(route)
                .build();
        vehicleDAO.create(vehicle);
        return vehicle;
    }
}
