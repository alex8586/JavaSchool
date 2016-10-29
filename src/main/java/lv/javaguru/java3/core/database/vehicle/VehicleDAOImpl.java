package lv.javaguru.java3.core.database.vehicle;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.TransportTypeDAO;
import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.TransportType;
import lv.javaguru.java3.core.domain.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class VehicleDAOImpl extends CRUDOperationDAOImpl<Vehicle, Long> implements VehicleDAO {

}
