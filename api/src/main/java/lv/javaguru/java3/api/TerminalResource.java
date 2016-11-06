package lv.javaguru.java3.api;

import lv.javaguru.java3.dto.TerminalDTO;
import javax.ws.rs.*;
import java.util.List;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Path(RESTResource.API_PATH)
public interface TerminalResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/termin")
    TerminalDTO create(TerminalDTO terminalDTO);

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/termin")
    TerminalDTO update(TerminalDTO terminalDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/termin/{terminalsId}")
    TerminalDTO get(@PathParam("terminalsId") Long terminalId);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/termin")
    List<TerminalDTO> getAll();
}
