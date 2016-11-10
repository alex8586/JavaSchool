package lv.javaguru.java3.database.impl.terminals;

import lv.javaguru.java3.database.api.termnals.TerminalTypeDAO;
import lv.javaguru.java3.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.terminals.TerminalType;
import org.springframework.stereotype.Component;

@Component
public class TerminalTypeDAOImpl extends CRUDOperationDAOImpl<TerminalType, Long> implements TerminalTypeDAO {
}
