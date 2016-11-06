package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.clients.ClientService;
import lv.javaguru.java3.dto.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class GetAllClientsCommandHandler
        implements DomainCommandHandler<GetAllClientsCommand, GetAllClientsResult> {

    @Autowired private ClientService clientService;
    @Autowired private ClientConverter clientConverter;


    @Override
    public GetAllClientsResult execute(GetAllClientsCommand command) {

        List<Client> clients = clientService.getAll();
        List<ClientDTO> clientDTOs = clientConverter.convert(clients);
        return new GetAllClientsResult(clientDTOs);
    }

    @Override
    public Class getCommandType() {
        return GetAllClientsCommand.class;
    }

}
