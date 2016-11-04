package lv.javaguru.java3.core.domain.tickets;

import javax.persistence.*;


@Entity
@Table(name = "token_types")
public class TokenType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name = "name")
    String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TokenType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
