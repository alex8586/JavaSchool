package lv.javaguru.java3.core.services.routes;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.TransportType;

import java.util.List;

public interface RouteService {
    Route update(Long routeId,
                 String newCode,
                 String newName,
                 long newTransportTypeId);
    Route get(Long routeId);
    List<Route> getAll();
}
