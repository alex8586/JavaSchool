package lv.javaguru.java3.services.terminals.terminals;

import lv.javaguru.java3.database.api.termnals.TerminalDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalDAO terminalDAO;

    @Override
    public Terminal update(long id, Vehicle vehicle, TerminalType terminalType) {
        Terminal terminal = get(id);
        terminal.setVehicle(vehicle);
        terminal.setTerminalType(terminalType);
        return terminal;
    }

    @Override
    public Terminal get(long id) {
        return terminalDAO.getRequired(id);
    }

    @Override
    public List<Terminal> getAll() {
        return terminalDAO.getAll();
    }
}
