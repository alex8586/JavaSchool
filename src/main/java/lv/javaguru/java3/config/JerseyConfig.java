package lv.javaguru.java3.config;

import lv.javaguru.java3.integrations.rest.impl.*;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ClientResourceImpl.class);
        register(RouteResourceImpl.class);
        register(TerminalResourceImpl.class);
        register(TerminalTypeResourceImpl.class);
        register(VehicleResourceImpl.class);
        register(DispatchResourceImpl.class);
        register(ClientBalanceResourceImpl.class);
        register(TripRegistrationResourceImpl.class);
    }

}
