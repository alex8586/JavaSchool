package lv.javaguru.java3.services.tickets.token;

import lv.javaguru.java3.core.domain.tickets.Ticket;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.domain.tickets.TokenType;

import java.util.List;

public interface TokenService {

    Token update(Long tokenId, TokenType tokenType, List<Ticket> ticketList);

    Token get(Long tokenId);
}
