package lv.javaguru.java3.core.commands.trips;

import lv.javaguru.java3.core.domain.tickets.TokenType;
import lv.javaguru.java3.integrations.rest.dto.TokenTypeDTO;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.integrations.rest.dto.TokenTypeDTOBuilder.createTokenTypeDTO;

@Component
public class TokenTypeConverter {

    public TokenTypeDTO convert(TokenType tokenType){
        return createTokenTypeDTO()
                .withId(tokenType.getId())
                .withName(tokenType.getName())
                .build();
    }
}
