package lv.javaguru.java3.core.services.routes;

import lv.javaguru.java3.core.database.*;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.TransportType;
import lv.javaguru.java3.core.services.clients.ClientValidator;
import org.springframework.beans.factory.annotation.Autowired;

import lv.javaguru.java3.core.domain.RouteBuilder;


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
