package lv.javaguru.java3.commands.vehicles.routes;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.dto.RouteDTO;
import lv.javaguru.java3.services.vehicles.routes.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class GetAllRoutesCommandHandler implements DomainCommandHandler<GetAllRoutesCommand, GetAllRoutesResult> {

    @Autowired private RouteService routeService;
    @Autowired private RouteConverter routeConverter;

    @Override
    public GetAllRoutesResult execute(GetAllRoutesCommand command) {
        List<Route> routes = routeService.getAll();
        List<RouteDTO> routeDTOs = routeConverter.convert(routes);
        return new GetAllRoutesResult(routeDTOs);
    }

}
