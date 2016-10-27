package lv.javaguru.java3.core.domain;

import javax.persistence.*;

@Entity
@Table(name = "terminals")
public class Terminal {

    @Id
    @GeneratedValue(generator = "terminals_sec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "terminals_sec", sequenceName = "terminals_sec", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name = "vehicle_id")
    private Long vehicleId;

    @Column(name = "terminal_type", nullable = false)
    private Long terminalType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Long terminalType) {
        this.terminalType = terminalType;
    }
}
