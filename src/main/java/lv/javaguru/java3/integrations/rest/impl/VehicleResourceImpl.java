package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.api.RESTResource;
import lv.javaguru.java3.api.VehicleResourse;
import lv.javaguru.java3.core.commands.vehicle.*;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class VehicleResourceImpl implements VehicleResourse {

    private CommandExecutor commandExecutor;

    @Autowired
    public VehicleResourceImpl(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles")
    public VehicleDTO create(VehicleDTO vehicleDTO) {
        CreateVehicleCommand command = new CreateVehicleCommand(vehicleDTO.getCarCode(), vehicleDTO.getRoute().getId());
        CreateVehicleResult result = commandExecutor.execute(command);
        return result.getVehicleDTO();
    }

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles")
    public VehicleDTO update(VehicleDTO vehicleDTO) {
        return null;
    }


    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles/{vehicleId}")
    public VehicleDTO get(@PathParam("vehicleId") Long vehicleId) {
        GetVehicleCommand command = new GetVehicleCommand(vehicleId);
        GetVehicleResult result = commandExecutor.execute(command);
        return result.getVehicleDTO();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles")
    public List<VehicleDTO> getAll() {
        GetAllVehicleCommand comand = new GetAllVehicleCommand();
        GetAllVehicleResult result = commandExecutor.execute(comand);
        return result.getVehicleDTOs();
    }

}
