package lv.javaguru.java3.domain.terminals;

import lv.javaguru.java3.domain.BaseEntity;
import lv.javaguru.java3.domain.vehicles.Vehicle;

import javax.persistence.*;

@Entity
@Table(name = "terminals")
@SequenceGenerator(name = "base_generator", sequenceName = "terminals_sec", allocationSize = 1)
public class Terminal extends BaseEntity{

    @ManyToOne(fetch = FetchType.EAGER)
    private Vehicle vehicle;

    @ManyToOne(fetch = FetchType.EAGER)
    private TerminalType terminalType;

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
