package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.vehicle.*;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.api.VehicleResourse;
import lv.javaguru.java3.integrations.rest.dto.VehicleDTO;
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
    @Path("/vehicle")
    public VehicleDTO create(VehicleDTO vehicleDTO) {
        CreateVehicleCommand comand = new CreateVehicleCommand(vehicleDTO.getCarCode(), vehicleDTO.getRoute());
        CreateVehicleResult result = commandExecutor.execute(comand);
        return result.getVehicleDTO();
    }

    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicle")
    public VehicleDTO update(VehicleDTO vehicleDTO) {
        return null;
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicle/{vehicleId}")
    public VehicleDTO get(Long vehicleId) {
        GetVehicleCommand command = new GetVehicleCommand(vehicleId);
        GetVehicleResult result = commandExecutor.execute(command);
        return result.getVehicleDTO();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicle/all")
    public List<VehicleDTO> getAll() {
        GetAllVehicleCommand comand = new GetAllVehicleCommand();
        GetAllVehicleResult result = commandExecutor.execute(comand);
        return result.getVehicleDTOs();
    }
}
