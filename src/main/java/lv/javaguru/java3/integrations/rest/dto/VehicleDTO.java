package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.Route;

public class VehicleDTO {

    private Long id;
    private String carCode;
    private RouteDTO route;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public RouteDTO getRoute() {
        return route;
    }

    public void setRoute(RouteDTO routeDTO) {
        this.route = routeDTO;
    }
}
