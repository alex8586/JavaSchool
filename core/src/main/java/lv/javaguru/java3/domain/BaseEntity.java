package lv.javaguru.java3.domain;
import javax.persistence.*;


@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "base_generator", strategy = GenerationType.SEQUENCE)
    @Column(name="id", nullable = false)
    protected Long id;

    @Version
    @Column(name = "version")
    private Long version;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }
}
