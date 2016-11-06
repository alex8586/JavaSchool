package lv.javaguru.java3.database.impl.vehicles;

import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.database.api.vehicles.RouteDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import org.springframework.stereotype.Component;

@Component
public class RouteDAOImpl extends CRUDOperationDAOImpl<Route, Long> implements RouteDAO {


}
