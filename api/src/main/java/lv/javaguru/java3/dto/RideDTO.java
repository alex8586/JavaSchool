package lv.javaguru.java3.dto;

public class RideDTO {

    private Long id;
    private Long tripId;
    private TokenDTO token;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public TokenDTO getToken() {
        return token;
    }
    public void setToken(TokenDTO token) {
        this.token = token;
    }
}
