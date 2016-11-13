package lv.javaguru.java3.commands;


public interface CommandManager {
    DomainCommandHandler getCommandHandler(DomainCommand domainCommand);
}
