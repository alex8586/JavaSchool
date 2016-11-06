package lv.javaguru.java3.restapi.impl;

import lv.javaguru.java3.database.api.DispatchResource;
import lv.javaguru.java3.commands.vehicles.dispatch.DispatchCommand;
import lv.javaguru.java3.commands.vehicles.dispatch.DispatchResult;
import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.dto.DispatchDTO;
import lv.javaguru.java3.dto.DispatchMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

public class DispatchResourceImpl implements DispatchResource {

    @Autowired
    private CommandExecutor commandExecutor;

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/vehicles/dispatch")
    public DispatchDTO dispatch(DispatchMessageDTO messageDTO){
        DispatchCommand dispatchCommand = new DispatchCommand(messageDTO.getId());
        DispatchResult dispatchResult = commandExecutor.execute(dispatchCommand);
        return dispatchResult.getDispatchDTO();
    }
}
