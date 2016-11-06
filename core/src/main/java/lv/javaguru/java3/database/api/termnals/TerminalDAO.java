package lv.javaguru.java3.database.api.termnals;
import lv.javaguru.java3.CRUDOperationDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.vehicles.Vehicle;

public interface TerminalDAO extends CRUDOperationDAO<Terminal, Long> {

    Vehicle getVehicle(Long terminalId);
}
