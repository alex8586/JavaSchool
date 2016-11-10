package lv.javaguru.java3.commands.tickets.onetimeticket;

import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.OneTimeTicketDTO;

public class OneTimeTicketResult implements DomainCommandResult {

    private OneTimeTicketDTO oneTimeTicketDTO;

    public OneTimeTicketResult(OneTimeTicketDTO oneTimeTicketDTO) {
        this.oneTimeTicketDTO = oneTimeTicketDTO;
    }

    public OneTimeTicketDTO getOneTimeTicketDTO() {
        return oneTimeTicketDTO;
    }
}
