package lv.javaguru.java3.commands;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class TransactionalCommandExecutorImpl implements CommandExecutor {

    @Autowired
    CommandManager commandManager;

    @Transactional
    public <T extends DomainCommandResult> T execute(DomainCommand<T> domainCommand) {
        DomainCommandHandler handler = commandManager.getCommandHandler(domainCommand);
        if(handler != null) {
            return (T)handler.execute(domainCommand);
        }
        else {
            throw new IllegalArgumentException("Unknown domain command! " + domainCommand.toString());
        }
    }
}
