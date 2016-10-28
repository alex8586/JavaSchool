package lv.javaguru.java3.core.services.vehicle;

import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.Vehicle;

public interface VehicleFactory {

    Vehicle create(String carCode, Route route);

}
