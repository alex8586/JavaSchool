package lv.javaguru.java3.commands.vehicles.routes;

import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.RouteDTO;

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
