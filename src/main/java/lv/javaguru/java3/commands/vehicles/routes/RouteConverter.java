package lv.javaguru.java3.commands.vehicles.routes;

import lv.javaguru.java3.commands.vehicles.transportTypes.TransportTypeConverter;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.dto.RouteDTO;
import lv.javaguru.java3.dto.builders.RouteDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RouteConverter {

    @Autowired
    TransportTypeConverter transportTypeConverter;

    public RouteDTO convert(Route route){
        return RouteDTOBuilder.createRouteDTO().
                withId(route.getId()).
                withCode(route.getCode()).
                withName(route.getName()).
                withTransportTypeDTO(transportTypeConverter.convert(route.getTransportType())).
                build();
    }
    public List<RouteDTO> convert(List<Route> routes) {
        return routes.stream().map(this::convert).collect(Collectors.toList());
    }
}
