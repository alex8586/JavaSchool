package lv.javaguru.java3.api.vehicles;

import lv.javaguru.java3.CRUDOperationDAO;
import lv.javaguru.java3.domain.vehicles.Vehicle;

public interface VehicleDAO extends CRUDOperationDAO<Vehicle, Long> {
    Vehicle getByCode(String code);
}
