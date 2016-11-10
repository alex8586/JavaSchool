package lv.javaguru.java3.database.api;

import lv.javaguru.java3.dto.OneTimeTicketDTO;
import lv.javaguru.java3.dto.TerminalDTO;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface OneTimeTicketResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/onetimeticket")
    OneTimeTicketDTO create(TerminalDTO terminalDTO);
}
