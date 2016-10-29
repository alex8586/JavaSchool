package lv.javaguru.java3.integrations.rest.api;



import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import lv.javaguru.java3.integrations.rest.dto.DispatchDTO;
import lv.javaguru.java3.integrations.rest.dto.DispatchMessageDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(RESTResource.API_PATH)
public interface DispatchResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles/dispatch")
    DispatchDTO dispatch(DispatchMessageDTO messageDTO);

}
