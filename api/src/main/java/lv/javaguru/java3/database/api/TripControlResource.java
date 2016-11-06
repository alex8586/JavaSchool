package lv.javaguru.java3.database.api;
import lv.javaguru.java3.dto.RideDTO;
import lv.javaguru.java3.dto.TripControlRequestDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface TripControlResource {
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/trips/control")
    RideDTO check(TripControlRequestDTO tripControlRequestDTO);
}
