package lv.javaguru.java3.dto;

import java.util.Date;

public class TokenDTO {

    private TokenTypeDTO tokenType;
    private int balance;
    private Date date;

    public TokenTypeDTO getTokenTypeDTO() {
        return tokenType;
    }

    public void setTokenTypeDTO(TokenTypeDTO tokenTypeDTO) {
        this.tokenType = tokenTypeDTO;
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
}
