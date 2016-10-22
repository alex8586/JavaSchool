package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.clients.*;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.api.ClientResource;
import lv.javaguru.java3.integrations.rest.dto.ClientDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class ClientResourceImpl implements ClientResource {

    private CommandExecutor commandExecutor;

    @Autowired
    public ClientResourceImpl(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients")
    public ClientDTO create(ClientDTO clientDTO) {
        CreateClientCommand command = new CreateClientCommand(
                clientDTO.getLogin(), clientDTO.getPassword()
        );
        CreateClientResult result = commandExecutor.execute(command);
        return result.getClient();
    }

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients")
    public ClientDTO update(ClientDTO clientDTO) {
        UpdateClientCommand command = new UpdateClientCommand(
                clientDTO.getId(),clientDTO.getLogin(), clientDTO.getPassword()
        );
        UpdateClientResult result = commandExecutor.execute(command);
        return result.getClient();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients/{clientId}")
    public ClientDTO get(@PathParam("clientId") Long clientId) {
        GetClientCommand command = new GetClientCommand(clientId);
        GetClientResult result = commandExecutor.execute(command);
        return result.getClient();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients/all")
    public List<ClientDTO> get() {
        GetAllClientsCommand command = new GetAllClientsCommand();
        GetClientListResult result = commandExecutor.execute(command);
        return result.getClients();
    }
}
