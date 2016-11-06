package lv.javaguru.java3.services.trips.rides;

import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.trips.Ride;
import lv.javaguru.java3.domain.trips.Trip;
import org.springframework.stereotype.Component;

@Component
public class ExistingRideExtractorImpl implements ExistingRideExtractor{
    public Ride extract(Trip trip, Token token){
        for (Ride existingRide : trip.getRides()) {
            if(existingRide.getToken().getId() == token.getId()) {
                return existingRide;
            }
        }
        return null;
    }
}
