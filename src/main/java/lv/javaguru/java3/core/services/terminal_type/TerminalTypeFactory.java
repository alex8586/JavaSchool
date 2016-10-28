package lv.javaguru.java3.core.services.terminal_type;

import lv.javaguru.java3.core.domain.TerminalType;

public interface TerminalTypeFactory {

    TerminalType create(String name);
}
