package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.TerminalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.core.domain.TerminalBuilder.createTerminal;

@Component
public class TerminalFactoryImpl implements TerminalFactory {

    @Autowired
    private TerminalDAO terminalDAO;

    @Override
    public Terminal create(Vehicle vehicle, TerminalType terminalType) {
        Terminal terminal = createTerminal()
                .withVehicle(vehicle)
                .withTerminalType(terminalType)
                .build();
        terminalDAO.create(terminal);
        return terminal;
    }
}
