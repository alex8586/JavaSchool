package lv.javaguru.java3.databasetmp;

import lv.javaguru.java3.database.api.vehicles.VehicleDAO;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

public class VehicleDAOImplTest extends DatabaseHibernateTest<VehicleDAO> {
    @Test
    @Transactional
    public void test() {
        Vehicle vehicle = dao.getById(1L);
        System.out.println(vehicle);
        System.out.println(vehicle.getRoute());
        System.out.println(vehicle.getCurrentTrip());
    }

}