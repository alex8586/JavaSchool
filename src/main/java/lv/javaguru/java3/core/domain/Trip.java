package lv.javaguru.java3.core.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="trips")
public class Trip {

    @Id
    @GeneratedValue(generator = "trips_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "trips_seq", sequenceName = "trips_seq", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name = "is_ongoing")
    private boolean isOngoing = true;

    @Column(name = "vehicle_id")
    private long vehicleId;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id")
    private List<Ride> rides;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
