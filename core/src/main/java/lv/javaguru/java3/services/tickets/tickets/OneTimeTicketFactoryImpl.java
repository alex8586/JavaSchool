package lv.javaguru.java3.services.tickets.tickets;


import lv.javaguru.java3.database.api.tickets.OneTimeTicketDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.tickets.OneTimeTicket;
import lv.javaguru.java3.domain.trips.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneTimeTicketFactoryImpl implements OneTimeTicketFactory {

    @Autowired
    private OneTimeTicketDAO oneTimeTicketDAO;

    @Override
    public OneTimeTicket create(Trip trip, Terminal terminal, Long tokenId) {
        OneTimeTicket oneTimeTicket = new OneTimeTicket();
        oneTimeTicket.setTrip(trip);
        oneTimeTicket.setIssueTerminal(terminal);
        oneTimeTicket.setTokenId(tokenId);
        oneTimeTicketDAO.create(oneTimeTicket);
        return oneTimeTicket;
    }
}
