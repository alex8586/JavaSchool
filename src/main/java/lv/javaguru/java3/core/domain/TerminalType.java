package lv.javaguru.java3.core.domain;

import javax.persistence.*;

@Entity
@Table(name = "terminal_types")
public class TerminalType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TerminalType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
