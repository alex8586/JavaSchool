package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;

public class TerminalDTOBuilder {

    private Long id;
    private Vehicle vehicle;
    private TerminalType terminalType;

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

    public TerminalDTOBuilder withVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        return this;
    }

    public TerminalDTOBuilder withTerminalType(TerminalType terminalType){
        this.terminalType = terminalType;
        return this;
    }
}
