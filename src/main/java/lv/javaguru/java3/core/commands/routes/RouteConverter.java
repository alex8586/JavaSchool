package lv.javaguru.java3.core.commands.routes;


import lv.javaguru.java3.core.commands.transportTypes.TransportTypeConverter;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.integrations.rest.dto.RouteDTO;
import lv.javaguru.java3.integrations.rest.dto.RouteDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RouteConverter {

    @Autowired
    TransportTypeConverter transportTypeConverter;

    public RouteDTO convert(Route route){
        System.out.println(route);
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
