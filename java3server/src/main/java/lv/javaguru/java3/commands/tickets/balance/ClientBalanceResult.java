package lv.javaguru.java3.commands.tickets.balance;
import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.PrepaidRideTicketDTO;


public class ClientBalanceResult implements DomainCommandResult{

    private PrepaidRideTicketDTO prepaidRideTicketDTO;

    public ClientBalanceResult(PrepaidRideTicketDTO prepaidRideTicketDTO) {
        this.prepaidRideTicketDTO = prepaidRideTicketDTO;
    }

    public PrepaidRideTicketDTO getPrepaidRideTicketDTO() {
        return prepaidRideTicketDTO;
    }
}
