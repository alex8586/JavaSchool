package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.TransportType;
import org.springframework.beans.factory.annotation.Autowired;

public class RouteDTOBuilder {
    private Long id;
    private String code;
    private String name;

    private long transportTypeId;
    private TransportTypeDTO transportTypeDTO;

    private RouteDTOBuilder() {

    }

    public static RouteDTOBuilder createRouteDTO() {
        return new RouteDTOBuilder();
    }

    public RouteDTO build() {

        RouteDTO routeDTO = new RouteDTO();
        routeDTO.setId(id);
        routeDTO.setName(name);
        routeDTO.setCode(code);
        routeDTO.setTransportTypeId(transportTypeId);
        routeDTO.setTransportType(transportTypeDTO);
        return routeDTO;
    }

    public RouteDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public RouteDTOBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public RouteDTOBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public RouteDTOBuilder withTransportTypeId(long transportTypeId) {
        this.transportTypeId = transportTypeId;
        return this;
    }

    public RouteDTOBuilder withTransportType(TransportType transportType) {
        this.transportTypeDTO = TransportTypeDTOBuilder.buildFromTransportType(transportType);
        return this;
    }



}
