package lv.javaguru.java3.impl.terminals;

import lv.javaguru.java3.api.termnals.TerminalTypeDAO;
import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.terminals.TerminalType;
import org.springframework.stereotype.Component;

@Component
public class TerminalTypeDAOImpl extends CRUDOperationDAOImpl<TerminalType, Long> implements TerminalTypeDAO {
}
