package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.commands.VoidResult;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class DeleteClientCommandHandler implements DomainCommandHandler<DeleteClientCommand, VoidResult> {

    @Autowired private ClientService clientService;

    @Override
    public VoidResult execute(DeleteClientCommand command) {
        clientService.delete(command.getClientId());
        return VoidResult.INSTANCE;
    }

    @Override
    public Class getCommandType() {
        return DeleteClientCommand.class;
    }

}
