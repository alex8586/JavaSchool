package lv.javaguru.java3.core.database;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.Vehicle;

public interface TerminalDAO extends CRUDOperationDAO<Terminal, Long> {

    Vehicle getVehicle(Long terminalId);
}
