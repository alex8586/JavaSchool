package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.Route;

public class CreateVehicleCommand implements DomainCommand<CreateVehicleResult> {

    private String carCode;
    private Route route;

    public CreateVehicleCommand(String carCode, Route route) {
        this.carCode = carCode;
        this.route = route;
    }

    public String getCarCode() {
        return carCode;
    }

    public Route getRoute() {
        return route;
    }
}
