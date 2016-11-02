package lv.javaguru.java3.integrations.rest.dto;

public class OneTimeTicketDTO {

    private Long id;
    private TripDTO tripDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TripDTO getTripDTO() {
        return tripDTO;
    }

    public void setTripDTO(TripDTO tripDTO) {
        this.tripDTO = tripDTO;
    }
}
