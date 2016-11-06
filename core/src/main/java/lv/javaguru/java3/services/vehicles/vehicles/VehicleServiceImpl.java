package lv.javaguru.java3.services.vehicles.vehicles;

import lv.javaguru.java3.database.api.trips.TripDAO;
import lv.javaguru.java3.database.api.vehicles.VehicleDAO;
import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO vehicleDAO;

    @Autowired
    private TripDAO tripDAO;

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

    @Override
    //plz move me to Trip service
    public Trip revolveTrip(Vehicle vehicle){
        Trip oldTrip = vehicle.getCurrentTrip();
        if(oldTrip!=null)
            oldTrip.setIsOngoing(false);

        Trip newTrip = new Trip();
        newTrip.setVehicleId(vehicle.getId());
        tripDAO.create(newTrip);
        return newTrip;
    }
}
