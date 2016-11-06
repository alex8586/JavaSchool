package lv.javaguru.java3.commands.tickets.balance;

import lv.javaguru.java3.commands.DomainCommand;

public class ClientBalanceCommand implements DomainCommand<ClientBalanceResult> {

    private Long ticketId;

    public ClientBalanceCommand(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getTicketId() {
        return ticketId;
    }
}
