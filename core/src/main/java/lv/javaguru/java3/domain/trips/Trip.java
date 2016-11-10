package lv.javaguru.java3.domain.trips;

import lv.javaguru.java3.domain.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="trips")
@SequenceGenerator(name = "base_generator", sequenceName = "trips_seq", allocationSize = 1)
public class Trip extends BaseEntity{

    @Column(name = "is_ongoing")
    private boolean isOngoing = true;

    @Column(name = "vehicle_id")
    private long vehicleId;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id")
    private List<Ride> rides;

    public boolean isOngoing() {
        return isOngoing;
    }

    public void setIsOngoing(boolean isOngoing) {
        this.isOngoing = isOngoing;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", vehicleId=" + vehicleId +
                ", isOngoing=" + isOngoing +
                '}';
    }
}
