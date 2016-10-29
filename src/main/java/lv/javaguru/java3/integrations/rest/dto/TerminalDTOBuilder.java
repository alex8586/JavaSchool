package lv.javaguru.java3.integrations.rest.dto;

public class TerminalDTOBuilder {

    private long id;
    private VehicleDTO vehicle;
    private TerminalTypeDTO terminalType;

    private TerminalDTOBuilder(){

    }

    public static TerminalDTOBuilder createTerminalDTO(){
        return new TerminalDTOBuilder();
    }

    public TerminalDTO build(){
        TerminalDTO terminalDTO = new TerminalDTO();
        terminalDTO.setId(id);
        terminalDTO.setVehicle(vehicle);
        terminalDTO.setTerminalType(terminalType);
        return terminalDTO;
    }

    public TerminalDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TerminalDTOBuilder withVehicleDTO(VehicleDTO vehicleDTO){
        this.vehicle = vehicleDTO;
        return this;
    }

    public TerminalDTOBuilder withTerminalTypeDTO(TerminalTypeDTO terminalTypeDTO){
        this.terminalType = terminalTypeDTO;
        return this;
    }
}
