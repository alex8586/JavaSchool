package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.domain.Terminal;

import java.util.List;

public interface TerminalService {

    Terminal update(long id, long vehicleId, long terminalType);

    Terminal get(long id);

    List<Terminal> getAll();
}
