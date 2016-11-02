package lv.javaguru.java3.core.commands.trips.tripControl;


import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.commands.trips.tripRegistration.TripRegistrationResult;

public class TripControlCommand implements DomainCommand<TripControlResult> {
    private Long terminalId;
    private String vehicleCode;
    private Long tokenId;

    public TripControlCommand(Long terminalId, String vehicleCode, Long tokenId) {
        this.terminalId = terminalId;
        this.vehicleCode = vehicleCode;
        this.tokenId = tokenId;
    }

    public Long getTerminalId() {
        return terminalId;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public Long getTokenId() {
        return tokenId;
    }
}
