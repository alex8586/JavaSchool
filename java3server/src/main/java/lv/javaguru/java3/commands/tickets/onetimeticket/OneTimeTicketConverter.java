package lv.javaguru.java3.commands.tickets.onetimeticket;

import lv.javaguru.java3.core.commands.trips.TripConverter;
import lv.javaguru.java3.core.domain.tickets.OneTimeTicket;
import lv.javaguru.java3.integrations.rest.dto.OneTimeTicketDTO;
import lv.javaguru.java3.integrations.rest.dto.TripDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.integrations.rest.dto.OneTimeTicketDTOBuilder.createOneTimeTicketDTO;

@Component
public class OneTimeTicketConverter {

    @Autowired
    private TripConverter tripConverter;

    public OneTimeTicketDTO convert(OneTimeTicket oneTimeTicket){
        TripDTO tripDTO = tripConverter.convert(oneTimeTicket.getTrip());
        return createOneTimeTicketDTO()
                .withId(oneTimeTicket.getId())
                .withTrip(tripDTO)
                .build();
    }
}
