package lv.javaguru.java3.commands.tickets.onetimeticket;

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
