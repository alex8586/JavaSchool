package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.commands.terminalTypes.TerminalTypeConverter;
import lv.javaguru.java3.core.commands.vehicle.VehicleConverter;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

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
        terminalDTO.setVehicleDTO(vehicle);
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
