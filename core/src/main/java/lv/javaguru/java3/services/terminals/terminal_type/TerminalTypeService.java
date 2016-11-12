package lv.javaguru.java3.services.terminals.terminal_type;

import lv.javaguru.java3.database.api.termnals.TerminalTypeDAO;
import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.services.CoreOperationService;

public interface TerminalTypeService extends CoreOperationService<TerminalType,Long,TerminalTypeDAO> {
    TerminalType update(Long id, String name);
}
