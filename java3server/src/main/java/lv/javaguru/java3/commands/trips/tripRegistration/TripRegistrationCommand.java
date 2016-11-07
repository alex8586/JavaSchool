package lv.javaguru.java3.commands.trips.tripRegistration;

import lv.javaguru.java3.commands.DomainCommand;

public class TripRegistrationCommand implements DomainCommand<TripRegistrationResult> {

    private Long terminalId;
    private Long tokenId;

    public TripRegistrationCommand(Long terminalId, Long tokenId) {
        this.terminalId = terminalId;
        this.tokenId = tokenId;
    }

    public Long getTerminalId() {
        return terminalId;
    }

    public Long getTokenId() {
        return tokenId;
    }
}
