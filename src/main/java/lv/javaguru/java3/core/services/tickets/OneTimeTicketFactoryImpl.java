package lv.javaguru.java3.core.services.tickets;

import lv.javaguru.java3.core.database.OneTimeTicketDAO;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.tickets.OneTimeTicket;
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
