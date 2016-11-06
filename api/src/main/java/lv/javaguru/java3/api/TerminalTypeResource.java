package lv.javaguru.java3.api;

import lv.javaguru.java3.dto.TerminalTypeDTO;
import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface TerminalTypeResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_types")
    TerminalTypeDTO create(TerminalTypeDTO terminalTypeDTO);

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_types")
    TerminalTypeDTO update(TerminalTypeDTO terminalTypeDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_types/{terminalTypesId}")
    TerminalTypeDTO get(@PathParam("terminalTypesId") Long terminalTypeId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminal_types")
    List<TerminalTypeDTO> getAll();
}
