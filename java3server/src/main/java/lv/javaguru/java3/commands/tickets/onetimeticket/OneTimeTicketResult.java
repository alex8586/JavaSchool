package lv.javaguru.java3.commands.tickets.onetimeticket;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.OneTimeTicketDTO;

public class OneTimeTicketResult implements DomainCommandResult{

    private OneTimeTicketDTO oneTimeTicketDTO;

    public OneTimeTicketResult(OneTimeTicketDTO oneTimeTicketDTO) {
        this.oneTimeTicketDTO = oneTimeTicketDTO;
    }

    public OneTimeTicketDTO getOneTimeTicketDTO() {
        return oneTimeTicketDTO;
    }
}
