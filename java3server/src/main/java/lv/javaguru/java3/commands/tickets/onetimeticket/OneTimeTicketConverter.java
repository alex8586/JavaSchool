package lv.javaguru.java3.commands.tickets.onetimeticket;

import lv.javaguru.java3.commands.trips.trips.TripConverter;
import lv.javaguru.java3.domain.tickets.OneTimeTicket;
import lv.javaguru.java3.dto.OneTimeTicketDTO;
import lv.javaguru.java3.dto.TripDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.dto.builders.OneTimeTicketDTOBuilder.createOneTimeTicketDTO;


@Component
public class OneTimeTicketConverter {

    @Autowired
    private TripConverter tripConverter;

    public OneTimeTicketDTO convert(OneTimeTicket oneTimeTicket){
        if(oneTimeTicket == null)
            return null;

        return createOneTimeTicketDTO()
                .withId(oneTimeTicket.getId())
                .withTrip(tripConverter.convert(oneTimeTicket.getTrip()))
                .build();
    }
}
