package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;

public interface TerminalFactory {

    Terminal create(Vehicle vehicle, TerminalType terminalType);
}
