package lv.javaguru.java3.core.services.clients;

import lv.javaguru.java3.core.domain.Client;

import java.util.List;


public interface ClientService {

    Client update(Long clientId,
                  String newLogin,
                  String newPassword);
    void delete(Long clientId);
    Client get(Long clientId);
    List<Client> getAll();

}
