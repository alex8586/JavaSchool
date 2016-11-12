package lv.javaguru.java3.services.vehicles.routes;

import lv.javaguru.java3.database.api.vehicles.RouteDAO;
import lv.javaguru.java3.database.api.vehicles.TransportTypeDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.TransportType;
import lv.javaguru.java3.services.CoreOperationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouteServiceImpl extends CoreOperationServiceImpl<Route,Long,RouteDAO> implements RouteService {

    @Autowired private RouteValidator routeValidator;
    @Autowired private TransportTypeDAO transportTypeDAO;

    @Override
    public Route update(Long routeId, String newCode, String newName, long newTransportTypeId) {
        routeValidator.validate(newCode, newName);
        TransportType transportType = transportTypeDAO.getById(newTransportTypeId);
        Route route = this.get(routeId);
        route.setCode(newCode);
        route.setName(newName);
        route.setTransportType(transportType);
        return route;
    }
}
