package lv.javaguru.java3.services.terminals.terminals;

import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.domain.vehicles.Vehicle;

import java.util.List;

public interface TerminalService {

    Terminal update(long id, Vehicle vehicle, TerminalType terminalType);
    Terminal get(long id);
    List<Terminal> getAll();
}
