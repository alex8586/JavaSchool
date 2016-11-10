package lv.javaguru.java3.dto.builders;

import lv.javaguru.java3.dto.OneTimeTicketDTO;
import lv.javaguru.java3.dto.TripDTO;

public class OneTimeTicketDTOBuilder {

    private Long id;
    private TripDTO tripDTO;

    private OneTimeTicketDTOBuilder(){

    }

    public static OneTimeTicketDTOBuilder createOneTimeTicketDTO(){
        return new OneTimeTicketDTOBuilder();
    }

    public OneTimeTicketDTO build(){
        OneTimeTicketDTO oneTimeTicketDTO = new OneTimeTicketDTO();
        oneTimeTicketDTO.setId(id);
        oneTimeTicketDTO.setTripDTO(tripDTO);
        return oneTimeTicketDTO;
    }

    public OneTimeTicketDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public OneTimeTicketDTOBuilder withTrip(TripDTO tripDTO){
        this.tripDTO = tripDTO;
        return this;
    }

}
