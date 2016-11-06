package lv.javaguru.java3.impl.terminals;


import lv.javaguru.java3.api.termnals.TerminalDAO;
import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.vehicles.Vehicle;
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
