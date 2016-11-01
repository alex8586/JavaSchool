package lv.javaguru.java3.core.commands.trips;

import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.domain.tickets.TokenType;
import lv.javaguru.java3.integrations.rest.dto.RideDTO;
import lv.javaguru.java3.integrations.rest.dto.TokenDTO;
import lv.javaguru.java3.integrations.rest.dto.TokenTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static lv.javaguru.java3.integrations.rest.dto.TokenDTOBuilder.createTokenDTO;

@Component
public class TokenConverter {

    @Autowired
    private TokenTypeConverter tokenTypeConverter;

    public TokenDTO convert(Token token){

        return createTokenDTO()
                .withTokenTypeDTO(tokenTypeConverter.convert(token.getTokenType()))
                .withDate(new Date())
                .build();
    }
}
