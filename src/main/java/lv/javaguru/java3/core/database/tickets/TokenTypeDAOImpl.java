package lv.javaguru.java3.core.database.tickets;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.TokenTypeDAO;
import lv.javaguru.java3.core.domain.tickets.TokenType;
import org.springframework.stereotype.Component;

@Component
public class TokenTypeDAOImpl extends CRUDOperationDAOImpl<TokenType, Long> implements TokenTypeDAO {
}
