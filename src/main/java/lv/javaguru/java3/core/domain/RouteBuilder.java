package lv.javaguru.java3.core.domain;


public class RouteBuilder {
    private Long id;
    private String code;
    private String name;
    private TransportType transportType;

    private RouteBuilder() {

    }

    public static RouteBuilder createRoute() {
        return new RouteBuilder();
    }

    public Route build() {
        Route route = new Route();
        route.setCode(code);
        route.setName(name);
        route.setTransportType(transportType);
        return route;
    }

    public RouteBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public RouteBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public RouteBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public RouteBuilder withTransportType(TransportType transportType) {
        this.transportType = transportType;
        return this;
    }

}
