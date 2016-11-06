package lv.javaguru.java3.commands.vehicles.dispatch;
import lv.javaguru.java3.commands.DomainCommand;

public class DispatchCommand implements DomainCommand<DispatchResult> {
    private long terminalId;
    public DispatchCommand(long terminalId) {
        this.terminalId = terminalId;
    }
    public long getTerminalId() {
        return terminalId;
    }
}
