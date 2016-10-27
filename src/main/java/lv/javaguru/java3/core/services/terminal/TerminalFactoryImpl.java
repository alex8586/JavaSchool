package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.domain.Terminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.core.domain.TerminalBuilder.createTerminal;

@Component
public class TerminalFactoryImpl implements TerminalFactory {

    @Autowired
    private TerminalDAO terminalDAO;

    @Override
    public Terminal create(Long vehicleId, Long terminalType) {
        Terminal terminal = createTerminal()
                .withVehicleId(vehicleId)
                .withTerminalType(terminalType)
                .build();
        terminalDAO.create(terminal);
        return terminal;
    }
}
