package lv.javaguru.java3.services.vehicles.routes;


import lv.javaguru.java3.api.vehicles.RouteDAO;
import lv.javaguru.java3.api.vehicles.TransportTypeDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.TransportType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RouteServiceImpl implements RouteService {

    @Autowired private RouteValidator routeValidator;
    @Autowired private RouteDAO routeDAO;
    @Autowired private TransportTypeDAO transportTypeDAO;

    @Override
    public Route update(Long routeId, String newCode, String newName, long newTransportTypeId) {
        routeValidator.validate(newCode, newName);
        TransportType transportType = transportTypeDAO.getById(newTransportTypeId);
        Route route = get(routeId);
        route.setCode(newCode);
        route.setName(newName);
        route.setTransportType(transportType);
        return route;
    }

    @Override
    public Route get(Long routeId) {
        return routeDAO.getRequired(routeId);
    }

    @Override
    public List<Route> getAll() {
        return routeDAO.getAll();
    }

}
