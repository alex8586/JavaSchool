package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;

import java.util.List;

public class GetAllClientsResult implements DomainCommandResult {
    private List<ClientDTO> clients;
    public GetAllClientsResult(List<ClientDTO> clients) {
        this.clients = clients;
    }
    public List<ClientDTO> getClients() {
        return clients;
    }

}
