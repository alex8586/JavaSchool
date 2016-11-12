package lv.javaguru.java3.services.terminals.terminals;

import lv.javaguru.java3.database.api.termnals.TerminalDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.services.CoreOperationServiceImpl;
import org.springframework.stereotype.Component;


@Component
public class TerminalServiceImpl extends CoreOperationServiceImpl<Terminal,Long,TerminalDAO> implements TerminalService {

    @Override
    public Terminal update(long id, Vehicle vehicle, TerminalType terminalType) {
        Terminal terminal = get(id);
        terminal.setVehicle(vehicle);
        terminal.setTerminalType(terminalType);
        return terminal;
    }
}
