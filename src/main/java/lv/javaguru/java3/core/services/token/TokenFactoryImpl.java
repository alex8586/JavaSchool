package lv.javaguru.java3.core.services.token;

import lv.javaguru.java3.core.database.TokenDAO;
import lv.javaguru.java3.core.domain.tickets.Ticket;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.domain.tickets.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static lv.javaguru.java3.core.domain.tickets.TokenBuilder.createToken;

@Component
public class TokenFactoryImpl implements TokenFactory {

    @Autowired
    private TokenDAO tokenDAO;

    public Token create(TokenType tokenType, List<Ticket> ticketList){
        Token token = createToken()
                .withTokenType(tokenType)
                .withTicketList(ticketList)
                .build();
        tokenDAO.create(token);
        return token;
    }
}
