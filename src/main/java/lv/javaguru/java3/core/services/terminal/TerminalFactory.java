package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.domain.Terminal;

public interface TerminalFactory {

    Terminal create(Long vehicleId, Long terminalType);
}
