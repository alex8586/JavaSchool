package lv.javaguru.java3.domain.trips;

import lv.javaguru.java3.domain.BaseEntity;
import lv.javaguru.java3.domain.tickets.Token;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name="rides")
@SequenceGenerator(name = "base_generator", sequenceName = "rides_seq", allocationSize = 1)
public class Ride extends BaseEntity{

    @Column(name="trip_id")
    private Long tripId;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    private Token token;

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public Token getToken() {
        return token;
    }
    public void setToken(Token token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", token=" + token +
                '}';
    }
}
