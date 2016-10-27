package lv.javaguru.java3.core.database.clients;

import lv.javaguru.java3.core.database.TerminalTypeDAO;
import lv.javaguru.java3.core.domain.TerminalType;
import org.springframework.stereotype.Component;

@Component
public class TerminalTypeDAOImpl extends CRUDOperationDAOImpl<TerminalType, Long>
        implements TerminalTypeDAO{
}
