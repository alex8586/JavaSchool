package lv.javaguru.java3.core.commands.tickets;

import lv.javaguru.java3.core.domain.tickets.PrepaidRideTicket;
import lv.javaguru.java3.dto.PrepaidRideTicketDTO;
import org.springframework.stereotype.Component;
import static lv.javaguru.java3.dto.builders.PrepaidRideTicketDTOBuilder.createPrepaidRideTicket;


@Component
public class ClientBalanceConverter {

    public PrepaidRideTicketDTO convert(PrepaidRideTicket prepaidRideTicket){
        return createPrepaidRideTicket()
                .withBalance(prepaidRideTicket.getBalance())
                .build();
    }
}
