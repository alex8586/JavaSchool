package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.Route;

public class CreateVehicleCommand implements DomainCommand<CreateVehicleResult> {

    private String carCode;
    private long routeId;

    public CreateVehicleCommand(String carCode, long routeId) {
        this.carCode = carCode;
        this.routeId = routeId;
    }

    public String getCarCode() {
        return carCode;
    }

    public long getRouteId() {
        return routeId;
    }
}
