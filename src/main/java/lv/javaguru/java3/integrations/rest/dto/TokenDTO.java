package lv.javaguru.java3.integrations.rest.dto;

import java.util.Date;

public class TokenDTO {

    private TokenTypeDTO tokenTypeDTO;
    private int balance;
    private Date date;

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
}
