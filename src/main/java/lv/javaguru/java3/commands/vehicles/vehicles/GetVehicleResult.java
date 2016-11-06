package lv.javaguru.java3.commands.vehicles.vehicles;
import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.VehicleDTO;


public class GetVehicleResult implements DomainCommandResult{

    private VehicleDTO vehicleDTO;
    public GetVehicleResult(VehicleDTO vehicleDTO) {
        this.vehicleDTO = vehicleDTO;
    }
    public VehicleDTO getVehicleDTO() {
        return vehicleDTO;
    }
}
