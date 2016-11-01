package lv.javaguru.java3.core.commands.trips.tripRegistration;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.TokenDTO;

public class TripRegistrationResult implements DomainCommandResult{

    private TokenDTO tokenDTO;

    public TripRegistrationResult(TokenDTO tokenDTO) {
        this.tokenDTO = tokenDTO;
    }

    public TokenDTO getTokenDTO() {
        return tokenDTO;
    }
}
