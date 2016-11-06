package lv.javaguru.java3.commands.vehicles.routes;

import lv.javaguru.java3.commands.DomainCommand;

public class GetRouteCommand implements DomainCommand<GetRouteResult>{
    private Long routeId;
    public GetRouteCommand(Long routeId) {
        this.routeId = routeId;
    }
    public Long getRouteId() {
        return routeId;
    }
}
