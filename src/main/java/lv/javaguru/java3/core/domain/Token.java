package lv.javaguru.java3.core.domain;

import javax.persistence.*;


@Entity
@Table(name="tokens")
public class Token {

    @Id
    @GeneratedValue(generator = "tokens_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tokens_seq", sequenceName = "tokens_seq", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
