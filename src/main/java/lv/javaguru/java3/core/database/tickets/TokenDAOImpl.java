package lv.javaguru.java3.core.database.tickets;
import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.TokenDAO;
import lv.javaguru.java3.core.domain.tickets.Token;
import org.springframework.stereotype.Component;

@Component
public class TokenDAOImpl extends CRUDOperationDAOImpl<Token, Long> implements TokenDAO {

}
