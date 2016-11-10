package lv.javaguru.java3.database.impl.tickets;

import lv.javaguru.java3.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.database.api.tickets.TokenDAO;
import lv.javaguru.java3.domain.tickets.Token;
import org.springframework.stereotype.Component;

@Component
public class TokenDAOImpl extends CRUDOperationDAOImpl<Token, Long> implements TokenDAO {

}
