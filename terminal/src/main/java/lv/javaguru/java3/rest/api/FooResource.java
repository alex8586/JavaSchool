package lv.javaguru.java3.rest.api;

import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.commands.foo.FooCommand;
import lv.javaguru.java3.commands.foo.FooResult;
import lv.javaguru.java3.database.api.RESTResource;
import lv.javaguru.java3.dto.PrepaidRideTicketDTO;
import lv.javaguru.java3.dto.RouteDTO;
import lv.javaguru.java3.dto.TerminalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class FooResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/foo/{myId}")
    public TerminalDTO me(@PathParam("myId")Long myId) {
        System.out.println(myId);
        FooCommand fooCommand = new FooCommand();
        FooResult fooResult = commandExecutor.execute(fooCommand);
        return new TerminalDTO();
    }
}
