package lv.javaguru.java3.database.impl.tickets;

import lv.javaguru.java3.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.database.api.tickets.OneTimeTicketDAO;
import lv.javaguru.java3.domain.tickets.OneTimeTicket;
import org.springframework.stereotype.Component;

@Component
public class OneTimeTicketDAOIMpl extends CRUDOperationDAOImpl<OneTimeTicket, Long>
        implements OneTimeTicketDAO {

}
