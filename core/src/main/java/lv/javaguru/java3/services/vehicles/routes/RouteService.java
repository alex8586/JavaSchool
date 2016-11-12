package lv.javaguru.java3.services.vehicles.routes;

import lv.javaguru.java3.database.api.vehicles.RouteDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.services.CoreOperationService;

public interface RouteService extends CoreOperationService<Route,Long,RouteDAO>{
    Route update(Long routeId,
                 String newCode,
                 String newName,
                 long newTransportTypeId);
}
