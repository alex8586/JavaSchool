package lv.javaguru.java3.services.terminals.terminals;

import lv.javaguru.java3.database.api.termnals.TerminalDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.terminals.TerminalBuilder;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.domain.vehicles.Vehicle;
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
