package lv.javaguru.java3.integrations.rest.api;

import lv.javaguru.java3.integrations.rest.dto.PrepaidRideTicketDTO;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface ClientBalanceResource {

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/ticket/{ticketId}")
    PrepaidRideTicketDTO getBalance(@PathParam("ticketId") Long ticketId);

}
