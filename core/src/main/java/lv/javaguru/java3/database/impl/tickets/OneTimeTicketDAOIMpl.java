package lv.javaguru.java3.database.impl.tickets;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.OneTimeTicketDAO;
import lv.javaguru.java3.core.domain.tickets.OneTimeTicket;
import org.springframework.stereotype.Component;

@Component
public class OneTimeTicketDAOIMpl extends CRUDOperationDAOImpl<OneTimeTicket, Long>
        implements OneTimeTicketDAO {

}
