package lv.javaguru.java3.config;

import lv.javaguru.java3.rest.api.FooResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(FooResource.class);
    }
}
