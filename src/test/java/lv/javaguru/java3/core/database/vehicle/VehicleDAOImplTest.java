package lv.javaguru.java3.core.database.vehicle;

import lv.javaguru.java3.core.database.DatabaseHibernateTest;
import lv.javaguru.java3.core.database.RouteDAO;
import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.Vehicle;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;


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