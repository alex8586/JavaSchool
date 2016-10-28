package lv.javaguru.java3.core.services.vehicle;

import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.core.domain.VehicleBuilder.createVehicle;

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
