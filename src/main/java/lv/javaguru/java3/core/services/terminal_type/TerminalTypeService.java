package lv.javaguru.java3.core.services.terminal_type;

import lv.javaguru.java3.core.domain.TerminalType;

import java.util.List;

public interface TerminalTypeService {

    TerminalType update(Long id, String name);

    TerminalType get(Long id);

    List<TerminalType> getAll();
}
