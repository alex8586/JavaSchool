package lv.javaguru.java3.services.vehicles.routes;

import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.TransportType;

public interface RouteFactory {
    Route create(String code, String name, Long transportTypeId);
    Route create(String code, String name, TransportType transportType);
}
