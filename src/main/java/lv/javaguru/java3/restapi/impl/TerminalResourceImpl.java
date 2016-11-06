package lv.javaguru.java3.restapi.impl;

import lv.javaguru.java3.api.RESTResource;
import lv.javaguru.java3.api.TerminalResource;
import lv.javaguru.java3.commands.terminals.termnals.*;
import lv.javaguru.java3.commands.CommandExecutor;
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
    @Path("/termin")
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
    @Path("/termin/{terminalId}")
    public TerminalDTO get(@PathParam("terminalId") Long terminalsId) {
        GetTerminalCommand command = new GetTerminalCommand(terminalsId);
        GetTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTO();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/termin")
    public List<TerminalDTO> getAll() {
        GetAllTerminalCommand command = new GetAllTerminalCommand();
        GetAllTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTOs();
    }
}
