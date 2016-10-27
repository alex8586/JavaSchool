package lv.javaguru.java3.core.database.routes;

import lv.javaguru.java3.core.database.DatabaseHibernateTest;
import lv.javaguru.java3.core.database.RouteDAO;
import lv.javaguru.java3.core.domain.Route;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;


public class RouteDAOImplTest extends DatabaseHibernateTest<RouteDAO> {

    @Test
    @Transactional
    public void test() {
        List<Route> routes = dao.getAll();
    }
}