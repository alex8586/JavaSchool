package lv.javaguru.java3.services.vehicles.routes;

import lv.javaguru.java3.domain.vehicles.Route;
import java.util.List;

public interface RouteService {
    Route update(Long routeId,
                 String newCode,
                 String newName,
                 long newTransportTypeId);
    Route get(Long routeId);
    List<Route> getAll();
}
