package lv.javaguru.java3.core.commands.vehicle;

import lv.javaguru.java3.core.commands.DomainCommand;

public class GetVehicleCommand implements DomainCommand<GetVehicleResult> {

    private Long id;

    public GetVehicleCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
