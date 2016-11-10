package lv.javaguru.java3.services.tickets.tickets;

import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.tickets.OneTimeTicket;
import lv.javaguru.java3.domain.trips.Trip;

public interface OneTimeTicketFactory {

    OneTimeTicket create(Trip trip, Terminal terminal, Long tokenId);
}
