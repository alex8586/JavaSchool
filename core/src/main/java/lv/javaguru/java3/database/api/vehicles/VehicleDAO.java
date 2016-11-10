package lv.javaguru.java3.database.api.vehicles;

import lv.javaguru.java3.database.CRUDOperationDAO;
import lv.javaguru.java3.domain.vehicles.Vehicle;

public interface VehicleDAO extends CRUDOperationDAO<Vehicle, Long> {
    Vehicle getByCode(String code);
}
