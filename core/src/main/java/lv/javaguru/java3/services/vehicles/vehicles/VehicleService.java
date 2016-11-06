package lv.javaguru.java3.services.vehicles.vehicles;

import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle update(Long vehicleId, Route route, String carCode);

    Vehicle get(Long vehicleId);

    List<Vehicle> getAll();

    Trip revolveTrip(Vehicle vehicle);
}
