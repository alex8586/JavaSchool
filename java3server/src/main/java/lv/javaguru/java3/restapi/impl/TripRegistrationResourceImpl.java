package lv.javaguru.java3.restapi.impl;

import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.commands.trips.tripRegistration.TripRegistrationCommand;
import lv.javaguru.java3.commands.trips.tripRegistration.TripRegistrationResult;
import lv.javaguru.java3.database.api.RESTResource;
import lv.javaguru.java3.database.api.TripRegistrationResource;
import lv.javaguru.java3.dto.RideDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class TripRegistrationResourceImpl implements TripRegistrationResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/termin/{terminalId}/token/{tokenId}")
    public RideDTO registerTrip(@PathParam("terminalId") Long terminalId,
                                @PathParam("tokenId") Long tokenId) {
        TripRegistrationCommand command = new TripRegistrationCommand(terminalId, tokenId);
        TripRegistrationResult result = commandExecutor.execute(command);
        return result.getRideDTO();
    }

}
