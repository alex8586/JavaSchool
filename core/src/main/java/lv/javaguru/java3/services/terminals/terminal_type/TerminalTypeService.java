package lv.javaguru.java3.services.terminals.terminal_type;

import lv.javaguru.java3.domain.terminals.TerminalType;
import java.util.List;

public interface TerminalTypeService {

    TerminalType update(Long id, String name);

    TerminalType get(Long id);

    List<TerminalType> getAll();
}
