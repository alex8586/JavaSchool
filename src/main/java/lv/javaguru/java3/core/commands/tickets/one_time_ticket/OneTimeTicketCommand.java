package lv.javaguru.java3.core.commands.tickets.one_time_ticket;

import lv.javaguru.java3.core.commands.DomainCommand;

public class OneTimeTicketCommand implements DomainCommand<OneTimeTicketResult> {

    private Long terminalId;

    public OneTimeTicketCommand(Long terminalId) {
        this.terminalId = terminalId;
    }

    public Long getTerminalId() {
        return terminalId;
    }
}
