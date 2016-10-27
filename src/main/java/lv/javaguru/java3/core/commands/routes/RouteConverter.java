package lv.javaguru.java3.core.commands.routes;


import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.integrations.rest.dto.RouteDTO;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import static lv.javaguru.java3.integrations.rest.dto.RouteDTOBuilder.createRouteDTO;

@Component
public class RouteConverter {

    public RouteDTO convert(Route route){
        return createRouteDTO().
                withId(route.getId()).
                withCode(route.getCode()).
                withName(route.getName()).
                withTransportType(route.getTransportType()).
                withTransportTypeId(route.getTransportType().getId()).
                build();
    }
    public List<RouteDTO> convert(List<Route> routes) {
        return routes.stream().map(route -> convert(route)).collect(Collectors.toList());
    }
}
