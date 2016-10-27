package lv.javaguru.java3.core.commands.routes;

import lv.javaguru.java3.core.commands.clients.GetAllClientsCommand;
import lv.javaguru.java3.core.commands.clients.GetAllClientsResult;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.clients.ClientService;
import lv.javaguru.java3.core.services.routes.RouteService;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import lv.javaguru.java3.integrations.rest.dto.RouteDTO;
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

    @Override
    public Class getCommandType() {
        return GetAllRoutesCommand.class;
    }

}
