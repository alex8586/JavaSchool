package lv.javaguru.java3.core.database.terminals;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.Vehicle;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

@Component
public class TerminalDAOImpl extends CRUDOperationDAOImpl<Terminal, Long> implements TerminalDAO {

    public Vehicle getVehicle(Long terminalId){
        Session session = getCurrentSession();
        return (Vehicle) session.createCriteria(Vehicle.class)
                .add(Restrictions.eq("terminal_id", terminalId))
                .uniqueResult();
    }
}
