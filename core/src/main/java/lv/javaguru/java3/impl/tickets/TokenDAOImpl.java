package lv.javaguru.java3.impl.tickets;

import lv.javaguru.java3.CRUDOperationDAOImpl;
import lv.javaguru.java3.api.tickets.TokenDAO;
import lv.javaguru.java3.domain.tickets.Token;
import org.springframework.stereotype.Component;

@Component
public class TokenDAOImpl extends CRUDOperationDAOImpl<Token, Long> implements TokenDAO {

}
