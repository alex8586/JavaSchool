package lv.javaguru.java3.integrations.rest.dto;

public class PrepaidRideTicketDTOBuilder {

    private int balance;

    private PrepaidRideTicketDTOBuilder(){

    }

    public static PrepaidRideTicketDTOBuilder createPrepaidRideTicket(){
        return new PrepaidRideTicketDTOBuilder();
    }

    public PrepaidRideTicketDTO build(){
        PrepaidRideTicketDTO prepaidRideTicketDTO = new PrepaidRideTicketDTO();
        prepaidRideTicketDTO.setBalance(balance);
        return prepaidRideTicketDTO;
    }

    public PrepaidRideTicketDTOBuilder withBalance(int balance){
        this.balance = balance;
        return this;
    }
}
