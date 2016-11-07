package lv.javaguru.java3.commands.tickets.tokens;

import lv.javaguru.java3.domain.tickets.TokenType;
import lv.javaguru.java3.dto.TokenTypeDTO;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.dto.builders.TokenTypeDTOBuilder.createTokenTypeDTO;

@Component
public class TokenTypeConverter {

    public TokenTypeDTO convert(TokenType tokenType){
        return createTokenTypeDTO()
                .withId(tokenType.getId())
                .withName(tokenType.getName())
                .build();
    }
}
