package lv.javaguru.java3.services.trips.rides;

import lv.javaguru.java3.api.trips.RideDAO;
import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.trips.Ride;
import lv.javaguru.java3.domain.trips.Trip;
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
