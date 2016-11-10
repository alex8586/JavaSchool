package lv.javaguru.java3.commands.tickets.tokens;

import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.dto.TokenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static lv.javaguru.java3.dto.builders.TokenDTOBuilder.createTokenDTO;


@Component
public class TokenConverter {

    @Autowired
    private TokenTypeConverter tokenTypeConverter;

    public TokenDTO convert(Token token){
        if(token == null)
            return null;
        return createTokenDTO()
                .withTokenTypeDTO(tokenTypeConverter.convert(token.getTokenType()))
                .withDate(new Date())
                .build();
    }
}
