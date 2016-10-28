package lv.javaguru.java3.core.services.vehicle;

import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO vehicleDAO;

    @Override
    public Vehicle update(Long vehicleId, Route route, String carCode) {
        Vehicle vehicle = get(vehicleId);
        vehicle.setRoute(route);
        vehicle.setCarCode(carCode);
        return vehicle;
    }

    @Override
    public Vehicle get(Long vehicleId) {
        return vehicleDAO.getRequired(vehicleId);
    }

    @Override
    public List<Vehicle> getAll() {
        return vehicleDAO.getAll();
    }
}
