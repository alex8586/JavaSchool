package lv.javaguru.java3.services.tickets.token_type;

import lv.javaguru.java3.database.api.tickets.TokenTypeDAO;
import lv.javaguru.java3.domain.tickets.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenTypeServiceImpl implements TokenTypeService {

    @Autowired
    private TokenTypeDAO tokenTypeDAO;

    @Override
    public TokenType get(Long id) {
        return tokenTypeDAO.getRequired(id);
    }
}
