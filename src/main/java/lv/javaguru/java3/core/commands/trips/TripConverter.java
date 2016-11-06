package lv.javaguru.java3.core.commands.trips;

import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.dto.TripDTO;
import lv.javaguru.java3.dto.builders.TripDTOBuilder;
import org.springframework.stereotype.Component;

@Component
public class TripConverter {
    public TripDTO convert(Trip trip ) {
        return TripDTOBuilder.createTripDTO()
                .withId(trip.getId())
                .withIsOngoing(trip.isOngoing())
                .withVehicleId(trip.getVehicleId())
                .build();
    }
}
