package lv.javaguru.java3.core.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name="rides")
public class Ride {

    @Id
    @GeneratedValue(generator = "rides_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "rides_seq", sequenceName = "rides_seq", allocationSize = 1)
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    Token token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", token=" + token +
                '}';
    }
}
