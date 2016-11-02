package lv.javaguru.java3.core.commands.trips.tripControl;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.RideDTO;


public class TripControlResult implements DomainCommandResult {
    private RideDTO rideDTO;

    public TripControlResult(RideDTO rideDTO) {
        this.rideDTO = rideDTO;
    }

    public RideDTO getRideDTO() {
        return rideDTO;
    }
}
