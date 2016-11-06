package lv.javaguru.java3.services.terminals.terminals;

import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.domain.vehicles.Vehicle;

public interface TerminalFactory {

    Terminal create(Vehicle vehicle, TerminalType terminalType);
}
