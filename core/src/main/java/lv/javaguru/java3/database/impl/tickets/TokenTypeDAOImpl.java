package lv.javaguru.java3.database.impl.tickets;


import lv.javaguru.java3.database.api.tickets.TokenTypeDAO;
import lv.javaguru.java3.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.tickets.TokenType;
import org.springframework.stereotype.Component;

@Component
public class TokenTypeDAOImpl extends CRUDOperationDAOImpl<TokenType, Long> implements TokenTypeDAO {
}
