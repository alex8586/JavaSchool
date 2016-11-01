package lv.javaguru.java3.core.commands.trips;


import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.integrations.rest.dto.RideDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.integrations.rest.dto.RideDTOBuilder.createRideDTO;

@Component
public class RideConverter {

    @Autowired
    TokenConverter tokenConverter;

    public RideDTO convert(Ride ride){
        return createRideDTO()
                .withId(ride.getId())
                .withTripId(ride.getTridId())
                .withTokenDTO(tokenConverter.convert(ride.getToken()))
                .build();
    }
}
