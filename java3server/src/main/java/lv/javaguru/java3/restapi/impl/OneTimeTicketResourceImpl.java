package lv.javaguru.java3.restapi.impl;


import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.commands.tickets.onetimeticket.OneTimeTicketCommand;
import lv.javaguru.java3.commands.tickets.onetimeticket.OneTimeTicketResult;
import lv.javaguru.java3.database.api.OneTimeTicketResource;
import lv.javaguru.java3.database.api.RESTResource;
import lv.javaguru.java3.dto.OneTimeTicketDTO;
import lv.javaguru.java3.dto.TerminalDTO;
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
    @Path("/onetimeticket")
    public OneTimeTicketDTO create(TerminalDTO terminalDTO) {
        OneTimeTicketCommand command = new OneTimeTicketCommand(terminalDTO.getId());
        OneTimeTicketResult result = commandExecutor.execute(command);
        return result.getOneTimeTicketDTO();
    }
}
