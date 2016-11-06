package lv.javaguru.java3.services.terminals.terminal_type;


import lv.javaguru.java3.api.termnals.TerminalTypeDAO;
import lv.javaguru.java3.domain.terminals.TerminalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.domain.terminals.TerminalTypeBuilder.createTerminalType;

@Component
public class TerminalTypeFactoryImpl implements TerminalTypeFactory {

    @Autowired
    private TerminalTypeDAO terminalTypeDAO;

    @Override
    public TerminalType create(String name) {
        TerminalType terminalType = createTerminalType()
                .withName(name)
                .build();
        terminalTypeDAO.create(terminalType);
        return terminalType;
    }
}
