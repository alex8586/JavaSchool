package lv.javaguru.java3.services.vehicles.routes;

import lv.javaguru.java3.api.vehicles.RouteDAO;
import lv.javaguru.java3.api.vehicles.TransportTypeDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.RouteBuilder;
import lv.javaguru.java3.domain.vehicles.TransportType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouteFactoryImpl implements RouteFactory {

    @Autowired private RouteValidator routeValidator;
    @Autowired private RouteDAO routeDAO;
    @Autowired private TransportTypeDAO transportTypeDAO;

    @Override
    public Route create(String code, String name, Long transportTypeId) {
        TransportType transportType = transportTypeDAO.getById(transportTypeId);
        return create(code,name,transportType);
    }

    @Override
    public Route create(String code, String name, TransportType transportType) {
        routeValidator.validate(code,name);
        Route route = RouteBuilder.createRoute().
                withCode(code).
                withName(name).
                withTransportType(transportType).
                build();
        routeDAO.create(route);
        return route;
    }
}
