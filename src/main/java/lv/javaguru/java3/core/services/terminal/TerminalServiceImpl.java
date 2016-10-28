package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;
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
