package lv.javaguru.java3.core.domain.tickets;

import lv.javaguru.java3.core.domain.Trip;

import javax.persistence.*;

@Entity
@Table(name="one_timers")
@PrimaryKeyJoinColumn(name="ticket_id" , referencedColumnName = "id")
public class OneTimer extends Ticket{

    @ManyToOne(fetch = FetchType.LAZY)
    Trip trip;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "OneTimer{" +
                "trip=" + trip +
                " " + super.toString() +
                '}';
    }
}
