package lv.javaguru.java3.domain.vehicles;

import lv.javaguru.java3.domain.BaseEntity;
import lv.javaguru.java3.domain.trips.Trip;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vehicles")
@SequenceGenerator(name = "base_generator", sequenceName = "vehicle_seq", allocationSize = 1)
public class Vehicle extends BaseEntity{

    @Column(name = "car_code", nullable = false)
    private String carCode;

    @ManyToOne(fetch = FetchType.EAGER)
    private Route route;

    @OneToMany(fetch = FetchType.EAGER)
    @Where(clause = "is_ongoing = 1")
    @JoinColumn(name = "vehicle_id")
    private List<Trip> trips;

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }
    public void addTrip(Trip trip){
        this.trips.add(trip);
    }

    public Trip getCurrentTrip(){
        if(trips == null || trips.size()== 0)
            return null;
        if(trips.size()>1)
            throw new IllegalStateException();
        return trips.get(0);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", carCode='" + carCode + '\'' +
                ", route=" + route +
                '}';
    }
}
