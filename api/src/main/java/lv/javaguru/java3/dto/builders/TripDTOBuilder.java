package lv.javaguru.java3.dto.builders;

import lv.javaguru.java3.dto.TripDTO;

public class TripDTOBuilder {
    private long id;
    private long vehicleId;
    private boolean isOngoing;

    private TripDTOBuilder(){

    }

    public static TripDTOBuilder createTripDTO(){
        return new TripDTOBuilder();
    }

    public TripDTO build(){
        TripDTO tripDTO = new TripDTO();
        tripDTO.setId(id);
        tripDTO.setVehicleId(vehicleId);
        tripDTO.setOngoing(isOngoing);
        return tripDTO;
    }

    public TripDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TripDTOBuilder withVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
        return this;
    }

    public TripDTOBuilder withIsOngoing(boolean isOngoing){
        this.isOngoing = isOngoing;
        return this;
    }

}
