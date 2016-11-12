package lv.javaguru.java3.services.tickets.token_type;

import lv.javaguru.java3.database.api.tickets.TokenTypeDAO;
import lv.javaguru.java3.domain.tickets.TokenType;
import lv.javaguru.java3.services.CoreOperationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenTypeServiceImpl extends CoreOperationServiceImpl<TokenType,Long,TokenTypeDAO> implements TokenTypeService {

}
