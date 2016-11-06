package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.api.RESTResource;
import lv.javaguru.java3.api.TripControlResource;
import lv.javaguru.java3.core.commands.trips.tripControl.TripControlCommand;
import lv.javaguru.java3.core.commands.trips.tripControl.TripControlResult;
import lv.javaguru.java3.core.services.CommandExecutor;

import lv.javaguru.java3.dto.RideDTO;
import lv.javaguru.java3.dto.TripControlRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class TripControlResourceImpl implements TripControlResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @Override
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/trips/control")
    public RideDTO check(TripControlRequestDTO tripControlRequestDTO) {
        System.out.println("trip control ");
        TripControlCommand tripControlCommand = new TripControlCommand(
                tripControlRequestDTO.getTerminalId(),
                tripControlRequestDTO.getVehicleCode(),
                tripControlRequestDTO.getTokenId()
        );

        TripControlResult tripControlResult = commandExecutor.execute(tripControlCommand);
        return tripControlResult.getRideDTO();
    }
}
