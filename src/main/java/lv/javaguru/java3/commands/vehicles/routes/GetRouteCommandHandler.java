package lv.javaguru.java3.commands.vehicles.routes;

import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.services.vehicles.routes.RouteService;
import lv.javaguru.java3.dto.RouteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetRouteCommandHandler implements DomainCommandHandler<GetRouteCommand, GetRouteResult> {

    @Autowired private RouteService routeService;
    @Autowired private RouteConverter routeConverter;

    @Override
    public GetRouteResult execute(GetRouteCommand command) {
        Route route = routeService.get(command.getRouteId());
        RouteDTO routeDTO = routeConverter.convert(route);
        return new GetRouteResult(routeDTO);
    }

    @Override
    public Class getCommandType() {
        return GetRouteCommand.class;
    }
}
