package lv.javaguru.java3.commands.trips.rides;

import lv.javaguru.java3.commands.tickets.tokens.TokenConverter;
import lv.javaguru.java3.domain.trips.Ride;
import lv.javaguru.java3.dto.RideDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static lv.javaguru.java3.dto.builders.RideDTOBuilder.createRideDTO;

@Component
public class RideConverter {

    @Autowired
    TokenConverter tokenConverter;

    public RideDTO convert(Ride ride){
        return createRideDTO()
                .withId(ride.getId())
                .withTripId(ride.getTripId())
                .withTokenDTO(tokenConverter.convert(ride.getToken()))
                .build();
    }
}
