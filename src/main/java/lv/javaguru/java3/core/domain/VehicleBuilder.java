package lv.javaguru.java3.core.domain;

public class VehicleBuilder {

    private Long id;
    private String carCode;
    private Route route;

    private VehicleBuilder(){

    }

    public static VehicleBuilder createVehicle(){
        return new VehicleBuilder();
    }

    public Vehicle build(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(id);
        vehicle.setCarCode(carCode);
        vehicle.setRoute(route);
        return vehicle;
    }

    public VehicleBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public VehicleBuilder withCarCode(String carCode){
        this.carCode = carCode;
        return this;
    }

    public VehicleBuilder withRoute(Route route){
        this.route = route;
        return this;
    }
}
