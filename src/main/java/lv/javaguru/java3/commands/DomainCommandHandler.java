package lv.javaguru.java3.commands;

import lv.javaguru.java3.commands.DomainCommand;
import lv.javaguru.java3.commands.DomainCommandResult;

public interface DomainCommandHandler<C extends DomainCommand, R extends DomainCommandResult> {

    R execute(C command);

    Class getCommandType();

}
