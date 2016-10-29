package lv.javaguru.java3.core.services.terminal;

import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.TerminalBuilder;
import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TerminalFactoryImpl implements TerminalFactory {

    @Autowired
    private TerminalDAO terminalDAO;

    @Override
    public Terminal create(Vehicle vehicle, TerminalType terminalType) {
        Terminal terminal = TerminalBuilder.createTerminal()
                .withVehicle(vehicle)
                .withTerminalType(terminalType)
                .build();
        System.out.println("before create " + terminal);

        terminalDAO.create(terminal);
        return terminal;
    }
}
