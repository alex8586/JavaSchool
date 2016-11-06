package lv.javaguru.java3.dto.builders;

import lv.javaguru.java3.dto.RouteDTO;
import lv.javaguru.java3.dto.VehicleDTO;

public class VehicleDTOBuilder {

    private Long id;
    private String carCode;
    private RouteDTO routeDTO;

    private VehicleDTOBuilder(){

    }

    public static VehicleDTOBuilder createVehicleDTO(){
        return new VehicleDTOBuilder();
    }

    public VehicleDTO build(){
        VehicleDTO vehicleDTO = new VehicleDTO();
        vehicleDTO.setId(id);
        vehicleDTO.setCarCode(carCode);
        vehicleDTO.setRoute(routeDTO);
        return vehicleDTO;
    }

    public VehicleDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public VehicleDTOBuilder withCarCode(String carCode){
        this.carCode = carCode;
        return this;
    }

    public VehicleDTOBuilder withRouteDTO(RouteDTO routeDTO){
        this.routeDTO = routeDTO;
        return this;
    }
}
