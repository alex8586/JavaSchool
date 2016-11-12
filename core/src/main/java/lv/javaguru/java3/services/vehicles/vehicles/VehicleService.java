package lv.javaguru.java3.services.vehicles.vehicles;

import lv.javaguru.java3.database.api.vehicles.VehicleDAO;
import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.services.CoreOperationService;

public interface VehicleService extends CoreOperationService<Vehicle,Long,VehicleDAO> {
    Vehicle update(Long vehicleId, Route route, String carCode);
    Trip revolveTrip(Vehicle vehicle);
}
