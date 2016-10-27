package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.domain.Terminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalDAO terminalDAO;

    @Override
    public Terminal update(long id, long vehicleId, long terminalType) {
        Terminal terminal = get(id);
        terminal.setVehicleId(vehicleId);
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
