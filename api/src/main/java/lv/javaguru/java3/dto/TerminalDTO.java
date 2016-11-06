package lv.javaguru.java3.dto;

import java.io.Serializable;

public class TerminalDTO implements Serializable {

    private Long id;

    private VehicleDTO vehicle;
    private TerminalTypeDTO terminalType;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public VehicleDTO getVehicle() {
        return vehicle;
    }
    public void setVehicle(VehicleDTO vehicle) {
        this.vehicle = vehicle;
    }

    public TerminalTypeDTO getTerminalType() {
        return terminalType;
    }
    public void setTerminalType(TerminalTypeDTO terminalType) {
        this.terminalType = terminalType;
    }
}
