package lv.javaguru.java3.domain.vehicles;

import lv.javaguru.java3.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="routes")
@SequenceGenerator(name = "base_generator", sequenceName = "routes_seq", allocationSize = 1)
public class Route extends BaseEntity{

    @Column(name="code", nullable = false)
    private String code;

    @Column(name="name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private TransportType transportType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", transportType=" + transportType +
                '}';
    }
}
