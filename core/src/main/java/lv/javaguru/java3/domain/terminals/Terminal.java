package lv.javaguru.java3.domain.terminals;

import lv.javaguru.java3.domain.vehicles.Vehicle;

import javax.persistence.*;

@Entity
@Table(name = "terminals")
public class Terminal {

    @Id
    @GeneratedValue(generator = "terminals_sec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "terminals_sec", sequenceName = "terminals_sec", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Vehicle vehicle;

    @ManyToOne(fetch = FetchType.EAGER)
    private TerminalType terminalType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TerminalType getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(TerminalType terminalType) {
        this.terminalType = terminalType;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "id=" + id +
                ", vehicles=" + vehicle +
                ", terminalType=" + terminalType +
                '}';
    }
}
