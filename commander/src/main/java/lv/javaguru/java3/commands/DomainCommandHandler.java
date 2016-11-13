package lv.javaguru.java3.commands;

public interface DomainCommandHandler<C extends DomainCommand, R extends DomainCommandResult> {
    R execute(C command);
}
