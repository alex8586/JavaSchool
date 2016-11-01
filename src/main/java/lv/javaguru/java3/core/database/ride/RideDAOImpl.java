package lv.javaguru.java3.core.database.ride;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.RideDAO;
import lv.javaguru.java3.core.domain.Ride;
import org.springframework.stereotype.Component;

@Component
public class RideDAOImpl extends CRUDOperationDAOImpl<Ride, Long> implements RideDAO {

}
