package lv.javaguru.java3.core.services.routes;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.TransportType;

public interface RouteFactory {
    Route create(String code, String name,Long transportTypeId);
    Route create(String code, String name, TransportType transportType);
}
