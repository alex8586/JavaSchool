package lv.javaguru.java3.core.commands.tickets;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.PrepaidRideTicketDTO;

public class ClientBalanceResult implements DomainCommandResult{

    private PrepaidRideTicketDTO prepaidRideTicketDTO;

    public ClientBalanceResult(PrepaidRideTicketDTO prepaidRideTicketDTO) {
        this.prepaidRideTicketDTO = prepaidRideTicketDTO;
    }

    public PrepaidRideTicketDTO getPrepaidRideTicketDTO() {
        return prepaidRideTicketDTO;
    }
}
