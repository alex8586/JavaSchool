package lv.javaguru.java3.domain.tickets;

import lv.javaguru.java3.domain.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="tokens")
@SequenceGenerator(name = "base_generator", sequenceName = "tokens_seq", allocationSize = 1)
public class Token extends BaseEntity{

    @ManyToOne(fetch = FetchType.EAGER)
    private TokenType tokenType;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "token_id")
    private List<Ticket> tickets = new ArrayList<Ticket>();

    public List<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", tokenType=" + tokenType +
                ", tickets=" + tickets +
                '}';
    }
}
