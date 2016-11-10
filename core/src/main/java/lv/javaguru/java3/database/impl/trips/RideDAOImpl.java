package lv.javaguru.java3.database.impl.trips;
import lv.javaguru.java3.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.database.api.trips.RideDAO;
import lv.javaguru.java3.domain.trips.Ride;
import org.springframework.stereotype.Component;

@Component
public class RideDAOImpl extends CRUDOperationDAOImpl<Ride, Long> implements RideDAO {

}
