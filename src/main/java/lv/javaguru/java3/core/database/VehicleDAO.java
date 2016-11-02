package lv.javaguru.java3.core.database;

import lv.javaguru.java3.core.domain.Vehicle;

public interface VehicleDAO extends CRUDOperationDAO<Vehicle, Long>{
    Vehicle getByCode(String code);
}
