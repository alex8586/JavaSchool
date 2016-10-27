package lv.javaguru.java3.integrations.rest.api;

import lv.javaguru.java3.integrations.rest.dto.TerminalTypeDTO;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface TerminalTypeResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_type")
    TerminalTypeDTO create(TerminalTypeDTO terminalTypeDTO);

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_type")
    TerminalTypeDTO update(TerminalTypeDTO terminalTypeDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_type/{terminalTypeId}")
    TerminalTypeDTO get(@PathParam("terminalTypeId") Long terminalTypeId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_types/all")
    List<TerminalTypeDTO> getAll();
}
