package lv.javaguru.java3.integrations.rest.dto;

import java.io.Serializable;

public class TerminalDTO implements Serializable {

    private Long id;
    private Long vehicleId;
    private Long terminalTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getTerminalTypeId() {
        return terminalTypeId;
    }

    public void setTerminalTypeId(Long terminalTypeId) {
        this.terminalTypeId = terminalTypeId;
    }
}
