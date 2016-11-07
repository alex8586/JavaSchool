package lv.javaguru.java3.commands.vehicles.vehicles;

import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.VehicleDTO;

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
