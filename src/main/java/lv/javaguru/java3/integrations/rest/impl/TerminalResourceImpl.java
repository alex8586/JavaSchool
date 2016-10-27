package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.api.TerminalResource;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
        return null;
    }

    @Override
    public TerminalDTO update(TerminalDTO terminalDTO) {
        return null;
    }

    @Override
    public TerminalDTO get(Long terminalId) {
        return null;
    }

    @Override
    public List<TerminalDTO> getAll() {
        return null;
    }
}
