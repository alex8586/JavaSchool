package lv.javaguru.java3.services.terminals.terminal_type;

import lv.javaguru.java3.database.api.termnals.TerminalTypeDAO;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.services.CoreOperationServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class TerminalTypeServiceImpl extends CoreOperationServiceImpl<TerminalType,Long,TerminalTypeDAO> implements TerminalTypeService {

    @Override
    public TerminalType update(Long id, String name) {
        TerminalType terminalType = this.get(id);
        terminalType.setName(name);
        return terminalType;
    }
}
