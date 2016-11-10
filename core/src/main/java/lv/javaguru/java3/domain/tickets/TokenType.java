package lv.javaguru.java3.domain.tickets;

import lv.javaguru.java3.domain.BaseEntity;

import javax.persistence.*;


@Entity
@Table(name = "token_types")
@SequenceGenerator(name = "base_generator", sequenceName = "token_types_seq", allocationSize = 1)
public class TokenType extends BaseEntity {


    @Column(name = "name")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TokenType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
