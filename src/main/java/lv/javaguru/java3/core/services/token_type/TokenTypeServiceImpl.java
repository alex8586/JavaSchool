package lv.javaguru.java3.core.services.token_type;

import lv.javaguru.java3.core.database.TokenTypeDAO;
import lv.javaguru.java3.core.domain.tickets.TokenType;
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
