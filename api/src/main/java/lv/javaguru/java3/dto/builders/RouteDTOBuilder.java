package lv.javaguru.java3.dto.builders;


import lv.javaguru.java3.dto.RouteDTO;
import lv.javaguru.java3.dto.TransportTypeDTO;

public class RouteDTOBuilder {
    private Long id;
    private String code;
    private String name;
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

    public RouteDTOBuilder withTransportTypeDTO(TransportTypeDTO transportTypeDTO) {
        this.transportTypeDTO = transportTypeDTO;
        return this;
    }
}
