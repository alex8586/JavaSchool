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
public class TokenDTOConverter {

    @Autowired
    private TokenTypeConverter tokenTypeConverter;
    @Autowired
    private RideConverter rideConverter;

    public TokenDTO convert(Token token, Ride ride){
        TokenType tokenType = token.getTokenType();
        TokenTypeDTO tokenTypeDTO = tokenTypeConverter.convert(tokenType);
        RideDTO rideDTO = rideConverter.convert(ride);

        return createTokenDTO()
                .withTokenTypeDTO(tokenTypeDTO)
                .withDate(new Date())
                .withRideDTO(rideDTO)
                .build();
    }
}
