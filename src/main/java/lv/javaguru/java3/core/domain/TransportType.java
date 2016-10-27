package lv.javaguru.java3.core.domain;

import javax.persistence.*;


@Entity
@Table(name="transport_types")
public class TransportType {

    @Id
    @GeneratedValue(generator = "transport_types_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "transport_types_seq", sequenceName = "transport_types_seq", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="code", nullable = false)
    private String code;

    @Column(name="name", nullable = false)
    private String name;

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
}
