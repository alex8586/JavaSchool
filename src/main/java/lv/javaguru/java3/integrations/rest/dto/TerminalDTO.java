package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;

import java.io.Serializable;

public class TerminalDTO implements Serializable {

    private Long id;
    private Vehicle vehicle;
    private TerminalType terminalType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TerminalType getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(TerminalType terminalType) {
        this.terminalType = terminalType;
    }
}
