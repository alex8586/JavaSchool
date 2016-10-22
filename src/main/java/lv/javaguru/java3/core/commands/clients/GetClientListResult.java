package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;

import java.util.List;

public class GetClientListResult implements DomainCommandResult {
    private List<ClientDTO> clients;
    public GetClientListResult(List<ClientDTO> clients) {
        this.clients = clients;
    }
    public List<ClientDTO> getClients() {
        return clients;
    }

}
