package lv.javaguru.java3.core.database;

import lv.javaguru.java3.core.domain.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class VehicleDAOImpl extends CRUDOperationDAOImpl<Vehicle, Long> implements VehicleDAO {

}
