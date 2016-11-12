package lv.javaguru.java3.services.tickets.token;

import lv.javaguru.java3.database.api.tickets.TokenDAO;
import lv.javaguru.java3.domain.tickets.Ticket;
import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.tickets.TokenType;
import lv.javaguru.java3.services.CoreOperationServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TokenServiceImpl extends CoreOperationServiceImpl<Token,Long,TokenDAO> implements TokenService {

    @Override
    public Token update(Long tokenId, TokenType tokenType, List<Ticket> ticketList) {
        Token token = get(tokenId);
        token.setTokenType(tokenType);
        token.setTickets(ticketList);
        dao.update(token);
        return token;
    }

}
