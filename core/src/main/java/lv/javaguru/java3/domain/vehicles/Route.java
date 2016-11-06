package lv.javaguru.java3.domain.vehicles;

import javax.persistence.*;

@Entity
@Table(name="routes")
public class Route {
    @Id
    @GeneratedValue(generator = "routes_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "routes_seq", sequenceName = "routes_seq", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="code", nullable = false)
    private String code;

    @Column(name="name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private TransportType transportType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
