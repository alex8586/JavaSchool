package lv.javaguru.java3.databasetmp;

import lv.javaguru.java3.database.api.vehicles.RouteDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class RouteDAOImplTest extends DatabaseHibernateTest<RouteDAO> {

    @Test
    @Transactional
    public void test() {

        System.out.println(dao);
        List<Route> routes = dao.getAll();
    }
}