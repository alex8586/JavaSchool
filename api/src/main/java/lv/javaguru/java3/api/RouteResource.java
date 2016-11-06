package lv.javaguru.java3.api;
import lv.javaguru.java3.dto.RouteDTO;
import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface RouteResource{

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/routes/{routeId}")
    RouteDTO get(@PathParam("routeId") Long routeId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/routes")
    List<RouteDTO> getAll();
}
