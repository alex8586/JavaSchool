package lv.javaguru.java3.core.database.clients;

import lv.javaguru.java3.core.database.ClientDAO;
import lv.javaguru.java3.core.database.DatabaseHibernateTest;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import static lv.javaguru.java3.core.domain.ClientBuilder.createClient;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ClientDAOImplTest extends DatabaseHibernateTest<ClientDAO> {

    @Test
    @Transactional
    public void testCreateClient() {
        Client client = createClient()
                .withLogin("login")
                .withPassword("password").build();
        assertThat(client.getId(), is(nullValue()));
        dao.create(client);
        assertThat(client.getId(), is(notNullValue()));
    }

    @Test
    @Transactional
    public void testGetClientById() {
        Client client = createClient()
                .withLogin("login")
                .withPassword("password").build();
        dao.create(client);
        Client clientFromDb = dao.getById(client.getId());
        assertThat(clientFromDb, is(notNullValue()));
    }

}