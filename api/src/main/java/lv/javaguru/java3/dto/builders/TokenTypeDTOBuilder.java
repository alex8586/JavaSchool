package lv.javaguru.java3.dto.builders;

import lv.javaguru.java3.dto.TokenTypeDTO;

public class TokenTypeDTOBuilder {

    private Long id;
    private String name;

    private TokenTypeDTOBuilder(){

    }

    public static TokenTypeDTOBuilder createTokenTypeDTO(){
        return new TokenTypeDTOBuilder();
    }

    public TokenTypeDTO build(){
        TokenTypeDTO tokenTypeDTO = new TokenTypeDTO();
        tokenTypeDTO.setId(id);
        tokenTypeDTO.setName(name);
        return tokenTypeDTO;
    }

    public TokenTypeDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TokenTypeDTOBuilder withName(String name){
        this.name = name;
        return this;
    }

}
