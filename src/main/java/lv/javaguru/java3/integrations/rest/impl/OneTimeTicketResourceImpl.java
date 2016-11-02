package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.tickets.one_time_ticket.OneTimeTicketCommand;
import lv.javaguru.java3.core.commands.tickets.one_time_ticket.OneTimeTicketResult;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.OneTimeTicketResource;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.dto.OneTimeTicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class OneTimeTicketResourceImpl implements OneTimeTicketResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/onetimeticket/{terminalId}")
    public OneTimeTicketDTO create(@PathParam("terminalId") Long terminalId) {
        OneTimeTicketCommand command = new OneTimeTicketCommand(terminalId);
        OneTimeTicketResult result = commandExecutor.execute(command);
        return result.getOneTimeTicketDTO();
    }
}
