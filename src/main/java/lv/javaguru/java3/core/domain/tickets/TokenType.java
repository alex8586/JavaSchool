package lv.javaguru.java3.core.domain.tickets;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Table(name = "token_types")
public class TokenType {

    @Id
    @GeneratedValue(generator = "token_types_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "token_types_seq", sequenceName = "token_types_seq", allocationSize = 1)
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
