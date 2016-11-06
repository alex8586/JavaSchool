package lv.javaguru.java3.database.impl.tickets;


import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.database.api.tickets.TicketDAO;
import lv.javaguru.java3.domain.tickets.Ticket;
import org.springframework.stereotype.Component;

@Component
public class TicketDAOImpl extends CRUDOperationDAOImpl<Ticket, Long> implements TicketDAO {
}
