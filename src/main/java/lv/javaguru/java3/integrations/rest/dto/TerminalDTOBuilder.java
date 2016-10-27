package lv.javaguru.java3.integrations.rest.dto;

public class TerminalDTOBuilder {

    private Long id;
    private Long vehicleId;
    private Long terminalTypeId;

    private TerminalDTOBuilder(){

    }

    public static TerminalDTOBuilder createTerminalDTO(){
        return new TerminalDTOBuilder();
    }

    public TerminalDTO build(){
        TerminalDTO terminalDTO = new TerminalDTO();
        terminalDTO.setId(id);
        terminalDTO.setVehicleId(vehicleId);
        terminalDTO.setTerminalTypeId(terminalTypeId);
        return terminalDTO;
    }

    public TerminalDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TerminalDTOBuilder withVehicleId(Long vehicleId){
        this.vehicleId = vehicleId;
        return this;
    }

    public TerminalDTOBuilder withTerminalTypeId(Long terminalTypeId){
        this.terminalTypeId = terminalTypeId;
        return this;
    }
}
