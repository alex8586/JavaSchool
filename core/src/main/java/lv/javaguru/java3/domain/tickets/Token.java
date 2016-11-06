package lv.javaguru.java3.domain.tickets;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="tokens")
public class Token {

    @Id
    @GeneratedValue(generator = "tokens_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tokens_seq", sequenceName = "tokens_seq", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private TokenType tokenType;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "token_id")
    private List<Ticket> tickets = new ArrayList<Ticket>();

    private Long tripId;

    public List<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", tokenType=" + tokenType +
                ", tickets=" + tickets +
                ", tripId=" + tripId +
                '}';
    }
}