package lv.javaguru.java3.commands.tickets.onetimeticket;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.tickets.OneTimeTicket;
import lv.javaguru.java3.domain.tickets.Ticket;
import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.tickets.TokenType;
import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.dto.OneTimeTicketDTO;
import lv.javaguru.java3.services.terminals.terminals.TerminalService;
import lv.javaguru.java3.services.tickets.tickets.OneTimeTicketFactory;
import lv.javaguru.java3.services.tickets.token.TokenFactory;
import lv.javaguru.java3.services.tickets.token.TokenService;
import lv.javaguru.java3.services.tickets.token_type.TokenTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OneTimeTicketCommandHandler
        implements DomainCommandHandler<OneTimeTicketCommand, OneTimeTicketResult> {

    @Autowired
    private TerminalService terminalService;
    @Autowired
    private TokenTypeService tokenTypeService;
    @Autowired
    private TokenFactory tokenFactory;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private OneTimeTicketFactory oneTimeTicketFactory;
    @Autowired
    private OneTimeTicketConverter oneTimeTicketConverter;

    @Override
    public OneTimeTicketResult execute(OneTimeTicketCommand command) {
        Terminal terminal = terminalService.get(command.getTerminalId());
        Vehicle vehicle = terminal.getVehicle();
        Trip currentTrip = vehicle.getCurrentTrip();

        TokenType tokenType = tokenTypeService.get(1L);
        List<Ticket> ticketList = new ArrayList<>();
        Token token = tokenFactory.create(tokenType, ticketList);

        OneTimeTicket oneTimeTicket = oneTimeTicketFactory.create(currentTrip, terminal, token.getId());

        ticketList.add(oneTimeTicket);
        token.setTickets(ticketList);
        tokenService.update(token.getId(), tokenType, ticketList);

        OneTimeTicketDTO oneTimeTicketDTO = oneTimeTicketConverter.convert(oneTimeTicket);
        return new OneTimeTicketResult(oneTimeTicketDTO);
    }
}
