package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.VehicleDTO;

import java.util.List;

public class GetAllVehicleResult implements DomainCommandResult{

    private List<VehicleDTO> vehicleDTOs;

    public GetAllVehicleResult(List<VehicleDTO> vehicleDTOs) {
        this.vehicleDTOs = vehicleDTOs;
    }

    public List<VehicleDTO> getVehicleDTOs() {
        return vehicleDTOs;
    }
}
