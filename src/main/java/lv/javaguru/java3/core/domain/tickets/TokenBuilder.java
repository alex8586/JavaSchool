package lv.javaguru.java3.core.domain.tickets;

import java.util.List;

public class TokenBuilder {

    private Long id;
    private TokenType tokenType;
    private List<Ticket> ticketList;

    private TokenBuilder(){

    }

    public static TokenBuilder createToken(){
        return new TokenBuilder();
    }

    public Token build(){
        Token token = new Token();
        token.setId(id);
        token.setTokenType(tokenType);
        token.setTickets(ticketList);
        return token;
    }

    public TokenBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TokenBuilder withTokenType(TokenType tokenType){
        this.tokenType = tokenType;
        return this;
    }

    public TokenBuilder withTicketList(List<Ticket> ticketList){
        this.ticketList = ticketList;
        return this;
    }
}
