package lv.javaguru.java3.database.impl.trips;

import lv.javaguru.java3.database.api.trips.TripDAO;
import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.trips.Trip;
import org.springframework.stereotype.Component;

@Component
public class TripDAOImpl extends CRUDOperationDAOImpl<Trip, Long> implements TripDAO {

}
