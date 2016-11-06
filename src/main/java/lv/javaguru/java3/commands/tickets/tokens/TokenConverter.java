package lv.javaguru.java3.commands.tickets.tokens;

import static lv.javaguru.java3.dto.builders.TokenDTOBuilder.createTokenDTO;
import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.dto.TokenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;


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
