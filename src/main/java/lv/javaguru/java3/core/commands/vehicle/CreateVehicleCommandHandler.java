package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.database.RouteDAO;
import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.vehicle.VehicleFactory;
import lv.javaguru.java3.integrations.rest.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateVehicleCommandHandler
        implements DomainCommandHandler <CreateVehicleCommand, CreateVehicleResult>{

    @Autowired
    private VehicleFactory vehicleFactory;
    @Autowired
    private VehicleConverter vehicleConverter;

    @Autowired
    private RouteDAO routeDAO;
    @Override
    public CreateVehicleResult execute(CreateVehicleCommand command) {
        Route route = routeDAO.getById(command.getRouteId());
        Vehicle vehicle = vehicleFactory.create(command.getCarCode(), route);
        VehicleDTO vehicleDTO = vehicleConverter.convert(vehicle);
        return new CreateVehicleResult(vehicleDTO);
    }

    @Override
    public Class getCommandType() {
        return CreateVehicleCommand.class;
    }
}
