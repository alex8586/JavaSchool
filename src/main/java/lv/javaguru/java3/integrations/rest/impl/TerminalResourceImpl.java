package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.terminal.*;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.api.TerminalResource;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class TerminalResourceImpl implements TerminalResource {

    private CommandExecutor commandExecutor;

    public TerminalResourceImpl(CommandExecutor commandExecutor){
        this.commandExecutor = commandExecutor;
    }

    @Override
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal")
    public TerminalDTO create(TerminalDTO terminalDTO) {
        CreateTerminalCommand command = new CreateTerminalCommand(terminalDTO.getVehicle(),
                                                                terminalDTO.getTerminalType());
        CreateTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTO();
    }

    @Override
    public TerminalDTO update(TerminalDTO terminalDTO) {
        return null;
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal/{terminalId}")
    public TerminalDTO get(Long terminalId) {
        GetTerminalCommand command = new GetTerminalCommand(terminalId);
        GetTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTO();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal/all")
    public List<TerminalDTO> getAll() {
        GetAllTerminalCommand command = new GetAllTerminalCommand();
        GetAllTerminalResult result = commandExecutor.execute(command);
        return result.getTerminalDTOs();
    }
}
