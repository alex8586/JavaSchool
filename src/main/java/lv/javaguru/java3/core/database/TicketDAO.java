package lv.javaguru.java3.core.database;

import lv.javaguru.java3.core.domain.tickets.Ticket;

import java.util.List;

public interface TicketDAO extends CRUDOperationDAO<Ticket, Long>{
    List getAll2(Class clazz) ;
}
