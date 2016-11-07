package lv.javaguru.java3.commands.vehicles.vehicles;

import lv.javaguru.java3.commands.DomainCommand;

public class GetVehicleCommand implements DomainCommand<GetVehicleResult> {

    private Long id;

    public GetVehicleCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
