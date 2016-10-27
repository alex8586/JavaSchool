package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static lv.javaguru.java3.integrations.rest.dto.ClientDTOBuilder.createClientDTO;

@Component
class ClientConverter {

    public ClientDTO convert(Client client) {
        return createClientDTO()
                .withId(client.getId())
                .withLogin(client.getLogin())
                .withPassword(client.getPassword()).build();
    }
    public List<ClientDTO> convert(List<Client> clients) {
        return clients.stream().map(client -> convert(client)).collect(Collectors.toList());
    }

}
