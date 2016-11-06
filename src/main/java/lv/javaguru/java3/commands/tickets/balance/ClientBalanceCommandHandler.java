package lv.javaguru.java3.commands.tickets.balance;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.database.api.tickets.TicketDAO;
import lv.javaguru.java3.domain.tickets.PrepaidRideTicket;
import lv.javaguru.java3.dto.PrepaidRideTicketDTO;
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
}
