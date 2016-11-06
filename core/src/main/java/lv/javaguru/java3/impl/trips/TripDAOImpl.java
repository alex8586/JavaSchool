package lv.javaguru.java3.impl.trips;

import lv.javaguru.java3.api.trips.TripDAO;
import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.trips.Trip;
import org.springframework.stereotype.Component;

@Component
public class TripDAOImpl extends CRUDOperationDAOImpl<Trip, Long> implements TripDAO {

}
