package lv.javaguru.java3.commands.vehicles.dispatch;

import lv.javaguru.java3.commands.trips.trips.TripConverter;
import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.dto.DispatchDTO;
import lv.javaguru.java3.dto.TripDTO;
import lv.javaguru.java3.dto.builders.DispatchDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DispatchConverter {

    @Autowired
    TripConverter tripConverter;

    public DispatchDTO convert(Trip oldTrip, Trip newTrip ) {
        TripDTO oldTripDTO = oldTrip == null ? null : tripConverter.convert(oldTrip);
        TripDTO newTripDTO = newTrip == null ? null : tripConverter.convert(newTrip);
        return DispatchDTOBuilder.createDispatchDTO()
                .withOldTrip(oldTripDTO)
                .withNewTrip(newTripDTO)
                .build();
    }
}
