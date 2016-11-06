package lv.javaguru.java3.services.vehicles.vehicles;

import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.Vehicle;

public interface VehicleFactory {

    Vehicle create(String carCode, Route route);

}
