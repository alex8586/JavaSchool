package lv.javaguru.java3.integrations.rest.dto;

public class TripRegistrationDTOBuilder {

    private Long terminalId;
    private Long tokenId;

    private TripRegistrationDTOBuilder(){

    }

    public static TripRegistrationDTOBuilder createTripRegistrationDTO(){
        return new TripRegistrationDTOBuilder();
    }

    public TripRegistrationDTO build(){
        TripRegistrationDTO tripRegistrationDTO = new TripRegistrationDTO();
        tripRegistrationDTO.setTerminalId(terminalId);
        tripRegistrationDTO.setTokenId(tokenId);
        return tripRegistrationDTO;
    }

    public TripRegistrationDTOBuilder withTerminalId(Long terminalId){
        this.terminalId = terminalId;
        return this;
    }

    public TripRegistrationDTOBuilder withTokenId(Long tokenId){
        this.tokenId = tokenId;
        return this;
    }
}
