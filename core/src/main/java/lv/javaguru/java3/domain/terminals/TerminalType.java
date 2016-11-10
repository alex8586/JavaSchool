package lv.javaguru.java3.domain.terminals;

import lv.javaguru.java3.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "terminal_types")
@SequenceGenerator(name = "base_generator", sequenceName = "terminal_types_sec", allocationSize = 1)
public class TerminalType extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

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
