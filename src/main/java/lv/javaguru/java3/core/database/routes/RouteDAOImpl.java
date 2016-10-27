package lv.javaguru.java3.core.database.routes;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.ClientDAO;
import lv.javaguru.java3.core.database.RouteDAO;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.Route;
import org.springframework.stereotype.Component;

@Component
public class RouteDAOImpl extends CRUDOperationDAOImpl<Route, Long> implements RouteDAO {


}
