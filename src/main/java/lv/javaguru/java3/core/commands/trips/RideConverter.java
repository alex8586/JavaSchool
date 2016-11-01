package lv.javaguru.java3.core.commands.trips;

import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.integrations.rest.dto.RideDTO;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.integrations.rest.dto.RideDTOBuilder.createRideDTO;

@Component
public class RideConverter {

    public RideDTO convert(Ride ride){
        return createRideDTO()
                .withId(ride.getId())
                .withToken(ride.getToken())
                .build();
    }
}
