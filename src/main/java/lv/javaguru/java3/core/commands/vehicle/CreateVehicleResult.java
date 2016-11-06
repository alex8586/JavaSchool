package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.dto.VehicleDTO;

public class CreateVehicleResult implements DomainCommandResult{
    private VehicleDTO vehicleDTO;

    public CreateVehicleResult(VehicleDTO vehicleDTO) {
        this.vehicleDTO = vehicleDTO;
    }
    public VehicleDTO getVehicleDTO() {
        return vehicleDTO;
    }
}
