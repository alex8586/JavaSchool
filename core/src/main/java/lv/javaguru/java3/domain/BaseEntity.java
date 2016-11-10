package lv.javaguru.java3.domain;
import javax.persistence.*;


@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "base_generator", strategy = GenerationType.SEQUENCE)
    @Column(name="id", nullable = false)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "version")
    @Version
    private Long version;

}
