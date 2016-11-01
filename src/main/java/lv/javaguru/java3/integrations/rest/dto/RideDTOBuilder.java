package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.tickets.Token;

public class RideDTOBuilder {

    private Long id;
    private Token token;

    private RideDTOBuilder(){

    }

    public static RideDTOBuilder createRideDTO(){
        return new RideDTOBuilder();
    }

    public RideDTO build(){
        RideDTO rideDTO = new RideDTO();
        rideDTO.setId(id);
        rideDTO.setToken(token);
        return rideDTO;
    }

    public RideDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public RideDTOBuilder withToken(Token token){
        this.token = token;
        return this;
    }
}
