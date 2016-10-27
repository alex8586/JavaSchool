package lv.javaguru.java3.core.commands.routes;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import lv.javaguru.java3.integrations.rest.dto.RouteDTO;

import java.util.List;

public class GetAllRoutesResult implements DomainCommandResult {
    private List<RouteDTO> routes;
    public GetAllRoutesResult(List<RouteDTO> routes) {
        this.routes = routes;
    }
    public List<RouteDTO> getRoutes() {
        return routes;
    }
}
