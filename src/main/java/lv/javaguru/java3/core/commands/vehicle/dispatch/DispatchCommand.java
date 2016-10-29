package lv.javaguru.java3.core.commands.vehicle.dispatch;
import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.Route;

public class DispatchCommand implements DomainCommand<DispatchResult> {
    private long terminalId;
    public DispatchCommand(long terminalId) {
        this.terminalId = terminalId;
    }
    public long getTerminalId() {
        return terminalId;
    }
}
