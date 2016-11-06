package lv.javaguru.java3.services.trips.rides;

import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.trips.Ride;
import lv.javaguru.java3.domain.trips.Trip;

public interface RideFactory {
    Ride create(Trip trip, Token token);
}
