package lv.javaguru.java3.core.services.ride;

import lv.javaguru.java3.core.database.RideDAO;
import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.tickets.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RideFactoryImpl implements RideFactory {

    @Autowired
    private RideDAO rideDAO;

    @Override
    public Ride create(Trip trip, Token token) {
        Ride ride = new Ride();
        ride.setTripId(trip.getId());
        ride.setToken(token);
        rideDAO.create(ride);
        return ride;
    }
}
