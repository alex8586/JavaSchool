package lv.javaguru.java3.domain.tickets;

import lv.javaguru.java3.domain.trips.Trip;

import javax.persistence.*;

@Entity
@Table(name="one_timers")
@PrimaryKeyJoinColumn(name="ticket_id" , referencedColumnName = "id")
public class OneTimeTicket extends Ticket{

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
        return "OneTimeTicket{" +
                "trips=" + trip +
                " " + super.toString() +
                '}';
    }
}
