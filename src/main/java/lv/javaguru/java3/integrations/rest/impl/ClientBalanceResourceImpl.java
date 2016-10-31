package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.tickets.ClientBalanceCommand;
import lv.javaguru.java3.core.commands.tickets.ClientBalanceResult;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.ClientBalanceResource;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.dto.PrepaidRideTicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class ClientBalanceResourceImpl implements ClientBalanceResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/ticket/{ticketId}")
    public PrepaidRideTicketDTO getBalance(@PathParam("ticketId")Long ticketId) {
        ClientBalanceCommand command = new ClientBalanceCommand(ticketId);
        ClientBalanceResult result = commandExecutor.execute(command);
        return result.getPrepaidRideTicketDTO();
    }
}
