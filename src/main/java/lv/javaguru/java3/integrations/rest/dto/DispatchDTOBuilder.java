package lv.javaguru.java3.integrations.rest.dto;


import lv.javaguru.java3.core.domain.Vehicle;

public class DispatchDTOBuilder {

    private  TripDTO oldTrip;
    private  TripDTO newTrip;

    private DispatchDTOBuilder() {}
    public static DispatchDTOBuilder createDispatchDTO() {
        return new DispatchDTOBuilder();
    }

    public DispatchDTO build(){
        DispatchDTO dispatchDTO = new DispatchDTO();
        dispatchDTO.setOldTrip(oldTrip);
        dispatchDTO.setNewTrip(newTrip);
        return dispatchDTO;
    }

    public DispatchDTOBuilder withOldTrip(TripDTO tripDTO) {
        this.oldTrip = tripDTO;
        return this;
    }

    public DispatchDTOBuilder withNewTrip(TripDTO tripDTO) {
        this.newTrip = tripDTO;
        return this;
    }

}
