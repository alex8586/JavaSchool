package lv.javaguru.java3.impl.tickets;


import lv.javaguru.java3.api.tickets.TokenTypeDAO;
import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.tickets.TokenType;
import org.springframework.stereotype.Component;

@Component
public class TokenTypeDAOImpl extends CRUDOperationDAOImpl<TokenType, Long> implements TokenTypeDAO {
}
