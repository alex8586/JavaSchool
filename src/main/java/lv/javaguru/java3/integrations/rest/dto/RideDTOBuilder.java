package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.tickets.Token;

public class RideDTOBuilder {

    private Long id;
    private Long tripId;
    private TokenDTO tokenDTO;

    private RideDTOBuilder(){

    }

    public static RideDTOBuilder createRideDTO(){
        return new RideDTOBuilder();
    }

    public RideDTO build(){
        RideDTO rideDTO = new RideDTO();
        rideDTO.setId(id);
        rideDTO.setTripId(tripId);
        rideDTO.setToken(tokenDTO);
        return rideDTO;
    }

    public RideDTOBuilder withTripId(Long tripId){
        this.tripId = tripId;
        return this;
    }

    public RideDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public RideDTOBuilder withTokenDTO(TokenDTO tokenDTO){
        this.tokenDTO = tokenDTO;
        return this;
    }
}
