package lv.javaguru.java3.commands.trips.trips;


import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.dto.TripDTO;
import lv.javaguru.java3.dto.builders.TripDTOBuilder;
import org.springframework.stereotype.Component;

@Component
public class TripConverter {
    public TripDTO convert(Trip trip ) {
        if(trip == null)
            return null;
        return TripDTOBuilder.createTripDTO()
                .withId(trip.getId())
                .withIsOngoing(trip.isOngoing())
                .withVehicleId(trip.getVehicleId())
                .build();
    }
}
