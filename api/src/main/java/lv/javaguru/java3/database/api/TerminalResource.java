package lv.javaguru.java3.database.api;

import lv.javaguru.java3.dto.TerminalDTO;
import javax.ws.rs.*;
import java.util.List;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Path(RESTResource.API_PATH)
public interface TerminalResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals")
    TerminalDTO create(TerminalDTO terminalDTO);

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals")
    TerminalDTO update(TerminalDTO terminalDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals/{terminalsId}")
    TerminalDTO get(@PathParam("terminalsId") Long terminalId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/terminals")
    List<TerminalDTO> getAll();
}
