package lv.javaguru.java3.core.database.tickets;

import lv.javaguru.java3.core.database.*;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.tickets.Ticket;
import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class TicketDAOImplTest extends DatabaseHibernateTest<TicketDAO> {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    MotherOfObjects motherOfObjects;

    @Autowired
    TicketDAO ticketDAO;

    @Autowired
    TokenDAO tokenDAO;


    @Test
    @Transactional
    public void test(){
        Token token = motherOfObjects.getSampleToken();
        Trip trip = motherOfObjects.getRevolvedTrip();
        motherOfObjects.addOneTimer(token,trip);
        motherOfObjects.addPrepaidRide(token,42);
        motherOfObjects.flush();
        System.out.println("======================================================================");
        List<Ticket> ticketList = ticketDAO.getAll();
        for (Ticket ticket : ticketList) {
            System.out.println(ticket);
        }
        System.out.println("======================================================================");
        Token newToken = tokenDAO.getById(token.getId());
        System.out.println(newToken.getTickets());

    }


}