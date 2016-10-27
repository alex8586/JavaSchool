package lv.javaguru.java3.integrations.rest.clients;

import feign.FeignException;
import lv.javaguru.java3.integrations.rest.RESTResourceTest;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import static lv.javaguru.java3.integrations.rest.dto.ClientDTOBuilder.createClientDTO;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class ClientResourceImplTest extends RESTResourceTest {

    private ClientDTO newClient;
    private ClientDTO persistentClient;

    @Before
    public void before(){
        super.init();
        newClient = createClientDTO()
                .withLogin(RandomStringUtils.random(20))
                .withPassword(RandomStringUtils.random(20)).build();
        persistentClient = clientResource.create(newClient);
    }

    @Test
    public void createClientTest() {
        assertThat(persistentClient, is(notNullValue()));
        assertThat(persistentClient.getId(), is(notNullValue()));

        assertThat(persistentClient.getLogin(), is(newClient.getLogin()));
        assertThat(persistentClient.getPassword(), is(newClient.getPassword()));
    }

    @Test
    public void getClientTest() {
        ClientDTO clientDTO = clientResource.get(persistentClient.getId());

        assertThat(persistentClient.getId(), is(clientDTO.getId()));
        assertThat(persistentClient.getLogin(), is(clientDTO.getLogin()));
        assertThat(persistentClient.getPassword(), is(clientDTO.getPassword()));
    }

    @Test
    public void updateClientTest(){
        ClientDTO clientDTO = clientResource.get(persistentClient.getId());
        clientDTO.setLogin(RandomStringUtils.random(20));
        clientDTO.setPassword(RandomStringUtils.random(20));

        ClientDTO updatedClient = clientResource.update(clientDTO);
        assertThat(updatedClient.getId(), is(clientDTO.getId()));
        assertThat(updatedClient.getLogin(), is(clientDTO.getLogin()));
        assertThat(updatedClient.getPassword(), is(clientDTO.getPassword()));
    }

    @Test (expected = FeignException.class)
    public void deleteClientTest(){
        ClientDTO clientDTO = clientResource.get(persistentClient.getId());
        clientResource.delete(clientDTO);
        clientResource.get(persistentClient.getId());
    }

    @Test (expected = FeignException.class)
    public void doubleDeleteClientTest(){
        ClientDTO clientDTO = clientResource.get(persistentClient.getId());
        clientResource.delete(clientDTO);
        clientResource.delete(clientDTO);
    }
}
