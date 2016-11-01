package lv.javaguru.java3.integrations.rest.dto;

import java.util.Date;

public class TokenDTO {

    private TokenTypeDTO tokenTypeDTO;
    private int balance;
    private Date date;
    private Long rideId;

    public TokenTypeDTO getTokenTypeDTO() {
        return tokenTypeDTO;
    }

    public void setTokenTypeDTO(TokenTypeDTO tokenTypeDTO) {
        this.tokenTypeDTO = tokenTypeDTO;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getRideId() {
        return rideId;
    }

    public void setRideId(Long rideId) {
        this.rideId = rideId;
    }
}
