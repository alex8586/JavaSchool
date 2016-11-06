package lv.javaguru.java3.restapi.impl;


import lv.javaguru.java3.api.RESTResource;
import lv.javaguru.java3.api.RouteResource;
import lv.javaguru.java3.commands.vehicles.routes.GetAllRoutesCommand;
import lv.javaguru.java3.commands.vehicles.routes.GetAllRoutesResult;
import lv.javaguru.java3.commands.vehicles.routes.GetRouteCommand;
import lv.javaguru.java3.commands.vehicles.routes.GetRouteResult;
import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.dto.RouteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class RouteResourceImpl implements RouteResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/routes/{routeId}")
    public RouteDTO get(@PathParam("routeId") Long routeId) {
        GetRouteCommand command = new GetRouteCommand(routeId);
        GetRouteResult result = commandExecutor.execute(command);
        return result.getRouteDTO();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/routes")
    public List<RouteDTO> getAll() {
        GetAllRoutesCommand command = new GetAllRoutesCommand();
        GetAllRoutesResult result = commandExecutor.execute(command);
        return result.getRoutes();
    }
}
