package lv.javaguru.java3.database.api;
import lv.javaguru.java3.dto.RideDTO;
import javax.ws.rs.*;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface TripRegistrationResource {

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals/{terminalId}/token/{tokenId}")
    RideDTO registerTrip(@PathParam("terminalId") Long terminalId,
                         @PathParam("tokenId") Long tokenId);
}
