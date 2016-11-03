package lv.javaguru.java3.core.services.tickets;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.tickets.OneTimeTicket;

public interface OneTimeTicketFactory {

    OneTimeTicket create(Trip trip, Terminal terminal, Long tokenId);
}
