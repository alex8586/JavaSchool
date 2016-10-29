package lv.javaguru.java3.core.commands.trips;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import lv.javaguru.java3.integrations.rest.dto.TripDTO;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.integrations.rest.dto.ClientDTOBuilder.createClientDTO;
import static lv.javaguru.java3.integrations.rest.dto.TripDTOBuilder.createTripDTO;

@Component
public class TripConverter {
    public TripDTO convert(Trip trip ) {
        return createTripDTO()
                .withId(trip.getId())
                .withIsOngoing(trip.isOngoing())
                .withVehicleId(trip.getVehicleId())
                .build();
    }
}
