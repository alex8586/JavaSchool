package lv.javaguru.java3.dto.builders;

import lv.javaguru.java3.dto.TokenDTO;
import lv.javaguru.java3.dto.TokenTypeDTO;

import java.util.Date;

public class TokenDTOBuilder {

    private TokenTypeDTO tokenTypeDTO;
    private int balance;
    private Date date;

    private TokenDTOBuilder(){

    }
    public static TokenDTOBuilder createTokenDTO(){
        return new TokenDTOBuilder();
    }

    public TokenDTO build(){
        TokenDTO tokenDTO = new TokenDTO();
        tokenDTO.setTokenTypeDTO(tokenTypeDTO);
        tokenDTO.setBalance(balance);
        tokenDTO.setDate(date);
        return tokenDTO;
    }

    public TokenDTOBuilder withTokenTypeDTO(TokenTypeDTO tokenTypeDTO){
        this.tokenTypeDTO = tokenTypeDTO;
        return this;
    }

    public TokenDTOBuilder withBalance(int balance){
        this.balance = balance;
        return this;
    }

    public TokenDTOBuilder withDate(Date date){
        this.date = date;
        return this;
    }

}
