package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.terminal_type.*;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.api.TerminalTypeResource;
import lv.javaguru.java3.integrations.rest.dto.TerminalTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class TerminalTypeResourceImpl implements TerminalTypeResource {

    private CommandExecutor commandExecutor;

    @Autowired
    public TerminalTypeResourceImpl(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_type")
    public TerminalTypeDTO create(TerminalTypeDTO terminalTypeDTO) {
        CreateTerminalTypeCommand command = new CreateTerminalTypeCommand(terminalTypeDTO.getName());
        CreateTerminalTypeResult result = commandExecutor.execute(command);
        return result.getTerminalTypeDTO();
    }

    @Override
    public TerminalTypeDTO update(TerminalTypeDTO terminalTypeDTO) {
        return null;
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_type/{terminalTypeId}")
    public TerminalTypeDTO get(Long terminalTypeId) {
        GetTerminalTypeCommand command = new GetTerminalTypeCommand(terminalTypeId);
        GetTerminalTypeResult result = commandExecutor.execute(command);
        return result.getTerminalTypeDTO();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_types/all")
    public List<TerminalTypeDTO> getAll() {
        GetAllTerminalTypeCommand command = new GetAllTerminalTypeCommand();
        GetAllTerminalTypeResult result = commandExecutor.execute(command);
        return result.getTerminalTypeDTOs();
    }
}
