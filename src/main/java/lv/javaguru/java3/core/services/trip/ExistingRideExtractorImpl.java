package lv.javaguru.java3.core.services.trip;

import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.tickets.Token;
import org.springframework.stereotype.Component;

@Component
public class ExistingRideExtractorImpl implements ExistingRideExtractor{

    public Ride extract(Trip trip, Token token){
        for (Ride existingRide : trip.getRides()) {
            if(existingRide.getTridId() == trip.getId()) {
                return existingRide;
            }
        }
        return null;
    }

}
