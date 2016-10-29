package lv.javaguru.java3.core.database.terminals;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.TerminalTypeDAO;
import lv.javaguru.java3.core.domain.TerminalType;
import org.springframework.stereotype.Component;

@Component
public class TerminalTypeDAOImpl extends CRUDOperationDAOImpl<TerminalType, Long> implements TerminalTypeDAO{
}
