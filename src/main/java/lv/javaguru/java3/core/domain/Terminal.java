package lv.javaguru.java3.core.domain;

import javax.persistence.*;

@Entity
@Table(name = "terminals")
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
                ", vehicle=" + vehicle +
                ", terminalType=" + terminalType +
                '}';
    }
}
