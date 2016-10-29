package lv.javaguru.java3.integrations.rest.dto;

public class DispatchDTO {
    private  TripDTO oldTrip;
    private  TripDTO newTrip;

    public TripDTO getOldTrip() {
        return oldTrip;
    }

    public void setOldTrip(TripDTO oldTrip) {
        this.oldTrip = oldTrip;
    }

    public TripDTO getNewTrip() {
        return newTrip;
    }

    public void setNewTrip(TripDTO newTrip) {
        this.newTrip = newTrip;
    }
}
