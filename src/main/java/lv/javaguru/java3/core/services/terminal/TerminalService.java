package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;

import java.util.List;

public interface TerminalService {

    Terminal update(long id, Vehicle vehicle, TerminalType terminalType);

    Terminal get(long id);

    List<Terminal> getAll();
}
