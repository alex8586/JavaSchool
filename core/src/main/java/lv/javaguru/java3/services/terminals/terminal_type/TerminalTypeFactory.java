package lv.javaguru.java3.services.terminals.terminal_type;

import lv.javaguru.java3.domain.terminals.TerminalType;

public interface TerminalTypeFactory {

    TerminalType create(String name);
}
