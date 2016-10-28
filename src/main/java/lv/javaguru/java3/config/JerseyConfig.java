package lv.javaguru.java3.config;

import lv.javaguru.java3.core.domain.TerminalType;
import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.integrations.rest.api.TerminalResource;
import lv.javaguru.java3.integrations.rest.impl.ClientResourceImpl;
import lv.javaguru.java3.integrations.rest.impl.RouteResourceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ClientResourceImpl.class);
        register(RouteResourceImpl.class);
        register(TerminalResource.class);
        register(TerminalType.class);
        register(Vehicle.class);
    }

}
