package lv.javaguru.java3.core.commands.tickets.one_time_ticket;

import lv.javaguru.java3.core.database.OneTimeTicketDAO;
import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.database.TokenTypeDAO;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.core.domain.tickets.OneTimeTicket;
import lv.javaguru.java3.core.domain.tickets.Ticket;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.domain.tickets.TokenType;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.token.TokenFactory;
import lv.javaguru.java3.core.services.token.TokenService;
import lv.javaguru.java3.integrations.rest.dto.OneTimeTicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OneTimeTicketCommandHandler
        implements DomainCommandHandler <OneTimeTicketCommand, OneTimeTicketResult>{

    @Autowired
    private TerminalDAO terminalDAO;
    @Autowired
    private TokenTypeDAO tokenTypeDAO;
    @Autowired
    private TokenFactory tokenFactory;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private OneTimeTicketDAO oneTimeTicketDAO;
    @Autowired
    private OneTimeTicketConverter oneTimeTicketConverter;

    @Override
    public OneTimeTicketResult execute(OneTimeTicketCommand command) {
        Terminal terminal = terminalDAO.getRequired(command.getTerminalId());
        Vehicle vehicle = terminal.getVehicle();
        Trip currentTrip = vehicle.getCurrentTrip();

        TokenType tokenType = tokenTypeDAO.getById(1L);
        List<Ticket> ticketList = new ArrayList<>();
        Token token = tokenFactory.create(tokenType, ticketList);

        OneTimeTicket oneTimeTicket = new OneTimeTicket();
        oneTimeTicket.setTrip(currentTrip);
        oneTimeTicket.setIssueTerminal(terminal);
        oneTimeTicket.setTokenId(token.getId());
        oneTimeTicketDAO.create(oneTimeTicket);

        ticketList.add(oneTimeTicket);
        token.setTickets(ticketList);
        tokenService.update(token.getId(), tokenType, ticketList);

        OneTimeTicketDTO oneTimeTicketDTO = oneTimeTicketConverter.convert(oneTimeTicket);
        return new OneTimeTicketResult(oneTimeTicketDTO);
    }

    @Override
    public Class getCommandType() {
        return OneTimeTicketCommand.class;
    }
}
