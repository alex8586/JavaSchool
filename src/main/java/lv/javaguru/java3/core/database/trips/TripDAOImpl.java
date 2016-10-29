package lv.javaguru.java3.core.database.trips;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.TripDAO;
import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class TripDAOImpl extends CRUDOperationDAOImpl<Trip, Long> implements TripDAO {

}
