package lv.javaguru.java3.impl.vehicles;


import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.api.vehicles.TransportTypeDAO;
import lv.javaguru.java3.domain.vehicles.TransportType;
import org.springframework.stereotype.Component;

@Component
public class TransportTypeDAOImpl extends CRUDOperationDAOImpl<TransportType, Long> implements TransportTypeDAO {


}
