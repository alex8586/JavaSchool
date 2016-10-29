package lv.javaguru.java3.core.commands.vehicle.dispatch;

import lv.javaguru.java3.core.commands.trips.TripConverter;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.integrations.rest.dto.DispatchDTO;
import lv.javaguru.java3.integrations.rest.dto.DispatchDTOBuilder;
import lv.javaguru.java3.integrations.rest.dto.TripDTO;
import lv.javaguru.java3.integrations.rest.dto.TripDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DispatchConverter {

    @Autowired
    TripConverter tripConverter;

    public DispatchDTO convert(Trip oldTrip,Trip newTrip ) {
        TripDTO oldTripDTO = oldTrip == null ? null : tripConverter.convert(oldTrip);
        TripDTO newTripDTO = tripConverter.convert(newTrip);
        return DispatchDTOBuilder.createDispatchDTO()
                .withOldTrip(oldTripDTO)
                .withNewTrip(newTripDTO)
                .build();
    }
}
