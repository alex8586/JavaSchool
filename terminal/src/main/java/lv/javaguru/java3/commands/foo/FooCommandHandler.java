package lv.javaguru.java3.commands.foo;

import lv.javaguru.java3.commands.DomainCommandHandler;
import org.springframework.stereotype.Component;

@Component
public class FooCommandHandler implements DomainCommandHandler<FooCommand, FooResult> {

    @Override
    public FooResult execute(FooCommand command) {
        return null;
    }
}
