package lv.javaguru.java3.services.tickets.token;

import lv.javaguru.java3.core.database.TokenDAO;
import lv.javaguru.java3.core.domain.tickets.Ticket;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.domain.tickets.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenDAO tokenDAO;

    @Override
    public Token update(Long tokenId, TokenType tokenType, List<Ticket> ticketList) {
        Token token = get(tokenId);
        token.setTokenType(tokenType);
        token.setTickets(ticketList);
        tokenDAO.update(token);
        return token;
    }

    @Override
    public Token get(Long tokenId) {
        return tokenDAO.getRequired(tokenId);
    }
}
