package lv.javaguru.java3.core.services.trip;


import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.tickets.Token;

public interface ExistingRideExtractor {
    Ride extract(Trip trip, Token token);

}
