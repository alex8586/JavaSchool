package lv.javaguru.java3.core.database.clients;

import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.domain.Terminal;
import org.springframework.stereotype.Component;

@Component
public class TerminalDAOImpl extends CRUDOperationDAOImpl<Terminal, Long> implements TerminalDAO {
}
