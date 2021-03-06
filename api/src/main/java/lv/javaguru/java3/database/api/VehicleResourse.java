package lv.javaguru.java3.database.api;

import lv.javaguru.java3.dto.VehicleDTO;

import javax.ws.rs.*;
import java.util.List;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface VehicleResourse {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles")
    VehicleDTO create(VehicleDTO vehicleDTO);

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles")
    VehicleDTO update(VehicleDTO vehicleDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles/{vehiclesId}")
    VehicleDTO get(@PathParam("vehiclesId") Long vehicleId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles")
    List<VehicleDTO> getAll();
}
