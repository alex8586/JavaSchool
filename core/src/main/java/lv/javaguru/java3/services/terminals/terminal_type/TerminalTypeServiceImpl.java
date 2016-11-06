package lv.javaguru.java3.services.terminals.terminal_type;

import lv.javaguru.java3.database.api.termnals.TerminalTypeDAO;
import lv.javaguru.java3.domain.terminals.TerminalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TerminalTypeServiceImpl implements TerminalTypeService {

    @Autowired
    private TerminalTypeDAO terminalTypeDAO;

    @Override
    public TerminalType update(Long id, String name) {
        TerminalType terminalType = get(id);
        terminalType.setName(name);
        return terminalType;
    }

    @Override
    public TerminalType get(Long id) {
        return terminalTypeDAO.getRequired(id);
    }

    @Override
    public List<TerminalType> getAll() {
        return terminalTypeDAO.getAll();
    }
}
