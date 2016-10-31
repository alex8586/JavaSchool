package lv.javaguru.java3.core.commands.tickets;

import lv.javaguru.java3.core.database.TicketDAO;
import lv.javaguru.java3.core.domain.tickets.PrepaidRideTicket;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.integrations.rest.dto.PrepaidRideTicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientBalanceCommandHandler
        implements DomainCommandHandler <ClientBalanceCommand, ClientBalanceResult>{

    @Autowired
    private TicketDAO ticketDAO;
    @Autowired
    private ClientBalanceConverter clientBalanceConverter;

    @Override
    public ClientBalanceResult execute(ClientBalanceCommand command) {
        PrepaidRideTicket prepaidRideTicket = (PrepaidRideTicket) ticketDAO.getById(command.getTicketId());
        System.out.println("prepaird ticket " + prepaidRideTicket.toString());
        PrepaidRideTicketDTO prepaidRideTicketDTO = clientBalanceConverter.convert(prepaidRideTicket);
        return new ClientBalanceResult(prepaidRideTicketDTO);
    }

    @Override
    public Class getCommandType() {
        return ClientBalanceCommand.class;
    }
}
