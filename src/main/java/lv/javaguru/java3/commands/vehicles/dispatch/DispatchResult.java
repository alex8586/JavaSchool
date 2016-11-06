package lv.javaguru.java3.commands.vehicles.dispatch;

import lv.javaguru.java3.commands.DomainCommandResult;
import lv.javaguru.java3.dto.DispatchDTO;


public class DispatchResult implements DomainCommandResult {
    private DispatchDTO dispatchDTO;

    public DispatchResult(DispatchDTO dispatchDTO) {
        this.dispatchDTO = dispatchDTO;
    }

    public DispatchDTO getDispatchDTO() {
        return dispatchDTO;
    }
}
