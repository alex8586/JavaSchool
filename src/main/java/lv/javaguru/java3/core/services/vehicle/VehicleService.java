package lv.javaguru.java3.core.services.vehicle;

import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle update(Long vehicleId, Route route, String carCode);

    Vehicle get(Long vehicleId);

    List<Vehicle> getAll();
}
