package lv.javaguru.java3.domain.vehicles;

import lv.javaguru.java3.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="transport_types")
@SequenceGenerator(name = "base_generator", sequenceName = "transport_types_seq", allocationSize = 1)
public class TransportType extends BaseEntity {

    @Column(name="code", nullable = false)
    private String code;

    @Column(name="name", nullable = false)
    private String name;

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

    @Override
    public String toString() {
        return "TransportType{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
