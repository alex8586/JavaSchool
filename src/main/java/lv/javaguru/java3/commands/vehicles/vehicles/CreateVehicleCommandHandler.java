package lv.javaguru.java3.commands.vehicles.vehicles;


import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.database.api.vehicles.RouteDAO;
import lv.javaguru.java3.domain.vehicles.Route;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.services.vehicles.vehicles.VehicleFactory;
import lv.javaguru.java3.dto.VehicleDTO;
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
}
