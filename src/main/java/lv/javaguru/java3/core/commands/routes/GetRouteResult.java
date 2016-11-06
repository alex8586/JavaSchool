package lv.javaguru.java3.core.commands.routes;
import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.dto.RouteDTO;


public class GetRouteResult implements DomainCommandResult {
    private RouteDTO routeDTO;
    public GetRouteResult(RouteDTO routeDTO) {
        this.routeDTO = routeDTO;
    }
    public RouteDTO getRouteDTO() {
        return routeDTO;
    }
}
