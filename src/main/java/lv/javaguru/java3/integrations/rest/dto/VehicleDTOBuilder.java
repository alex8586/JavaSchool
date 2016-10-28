package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.Route;

public class VehicleDTOBuilder {

    private Long id;
    private String carCode;
    private Route route;

    private VehicleDTOBuilder(){

    }

    public static VehicleDTOBuilder createVehicleDTO(){
        return new VehicleDTOBuilder();
    }

    public VehicleDTO build(){
        VehicleDTO vehicleDTO = new VehicleDTO();
        vehicleDTO.setId(id);
        vehicleDTO.setCarCode(carCode);
        vehicleDTO.setRoute(route);
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

    public VehicleDTOBuilder withRoute(Route route){
        this.route = route;
        return this;
    }
}
