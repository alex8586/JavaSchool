package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.api.RESTResource;
import lv.javaguru.java3.api.TerminalResource;
import lv.javaguru.java3.core.commands.terminals.*;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.dto.TerminalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class TerminalResourceImpl implements TerminalResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals")
    public TerminalDTO create(TerminalDTO terminalDTO) {
        CreateTerminalCommand command = new CreateTerminalCommand(terminalDTO.getVehicle().getId(),
                                                                  terminalDTO.getTerminalType().getId());
        CreateTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTO();
    }

    public TerminalDTO update(TerminalDTO terminalDTO) {
        return null;
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals/{terminalId}")
    public TerminalDTO get(@PathParam("terminalId") Long terminalsId) {
        GetTerminalCommand command = new GetTerminalCommand(terminalsId);
        GetTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTO();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals")
    public List<TerminalDTO> getAll() {
        GetAllTerminalCommand command = new GetAllTerminalCommand();
        GetAllTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTOs();
    }
}
