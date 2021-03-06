package lv.javaguru.java3.commands.trips.tripRegistration;

import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.RideDTO;


public class TripRegistrationResult implements DomainCommandResult{

    private RideDTO rideDTO;

    public TripRegistrationResult(RideDTO rideDTO) {
        this.rideDTO = rideDTO;
    }

    public RideDTO getRideDTO() {
        return rideDTO;
    }
}
