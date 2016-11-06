package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.dto.ClientDTO;
import static lv.javaguru.java3.dto.builders.ClientDTOBuilder.createClientDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

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
