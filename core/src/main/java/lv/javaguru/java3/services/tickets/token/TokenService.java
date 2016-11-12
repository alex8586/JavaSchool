package lv.javaguru.java3.services.tickets.token;

import lv.javaguru.java3.database.api.tickets.TokenDAO;
import lv.javaguru.java3.domain.tickets.Ticket;
import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.tickets.TokenType;
import lv.javaguru.java3.services.CoreOperationService;
import java.util.List;

public interface TokenService extends CoreOperationService<Token,Long,TokenDAO>{
    Token update(Long tokenId, TokenType tokenType, List<Ticket> ticketList);
}
