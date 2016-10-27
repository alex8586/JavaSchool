package lv.javaguru.java3.core.database.transportTypes;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.RouteDAO;
import lv.javaguru.java3.core.database.TransportTypeDAO;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.TransportType;
import org.springframework.stereotype.Component;



@Component
public class TransportTypeDAOImpl extends CRUDOperationDAOImpl<TransportType, Long> implements TransportTypeDAO {


}
