package lv.javaguru.java3.core.database.tickets;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.TicketDAO;
import lv.javaguru.java3.core.domain.tickets.Ticket;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketDAOImpl extends CRUDOperationDAOImpl<Ticket, Long> implements TicketDAO {
    @Override
    public List getAll2(Class clazz) {
        return getCurrentSession().createCriteria(clazz).list();
    }

}
