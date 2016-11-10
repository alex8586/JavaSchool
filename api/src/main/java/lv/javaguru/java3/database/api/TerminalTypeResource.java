package lv.javaguru.java3.database.api;

import lv.javaguru.java3.dto.TerminalTypeDTO;
import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface TerminalTypeResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminaltypes")
    TerminalTypeDTO create(TerminalTypeDTO terminalTypeDTO);

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminaltypes")
    TerminalTypeDTO update(TerminalTypeDTO terminalTypeDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminaltypes/{terminalTypesId}")
    TerminalTypeDTO get(@PathParam("terminalTypesId") Long terminalTypeId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminaltypes")
    List<TerminalTypeDTO> getAll();
}
