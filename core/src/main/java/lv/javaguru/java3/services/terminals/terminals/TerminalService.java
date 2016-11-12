package lv.javaguru.java3.services.terminals.terminals;

import lv.javaguru.java3.database.api.termnals.TerminalDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.services.CoreOperationService;

public interface TerminalService extends CoreOperationService<Terminal,Long,TerminalDAO> {
    Terminal update(long id, Vehicle vehicle, TerminalType terminalType);
}
