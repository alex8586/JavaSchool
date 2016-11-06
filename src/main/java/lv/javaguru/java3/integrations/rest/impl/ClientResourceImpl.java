package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.api.ClientResource;
import lv.javaguru.java3.api.RESTResource;
import lv.javaguru.java3.dto.ClientDTO;
import lv.javaguru.java3.core.commands.clients.*;
import lv.javaguru.java3.core.services.CommandExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients")
    public void delete(ClientDTO clientDTO){
        DeleteClientCommand command = new DeleteClientCommand(clientDTO.getId());
        commandExecutor.execute(command);
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
    public List<ClientDTO> getAll() {
        GetAllClientsCommand command = new GetAllClientsCommand();
        GetAllClientsResult result = commandExecutor.execute(command);
        return result.getClients();
    }
}
