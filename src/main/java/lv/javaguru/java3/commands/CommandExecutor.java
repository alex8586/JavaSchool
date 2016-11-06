package lv.javaguru.java3.commands;

import lv.javaguru.java3.commands.DomainCommand;
import lv.javaguru.java3.commands.DomainCommandResult;

public interface CommandExecutor {

    <T extends DomainCommandResult> T execute(DomainCommand<T> domainCommand);

}
