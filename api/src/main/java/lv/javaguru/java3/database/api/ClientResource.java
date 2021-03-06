package lv.javaguru.java3.database.api;
import lv.javaguru.java3.dto.ClientDTO;
import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface ClientResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients")
    ClientDTO create(ClientDTO clientDTO);

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients")
    ClientDTO update(ClientDTO clientDTO);

    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients")
    void delete(ClientDTO clientDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients/{clientId}")
    ClientDTO get(@PathParam("clientId") Long clientId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients/all")
    List<ClientDTO> getAll();
}
