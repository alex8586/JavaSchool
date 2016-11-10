package lv.javaguru.java3.database;

import lv.javaguru.java3.domain.BaseEntity;

import java.util.List;

public interface CRUDOperationDAO<E extends BaseEntity, K> {

    void create(E entity);

    E getById(K key);

    E getRequired(K key);

    void update(E entity);

    void delete(E entity);

    List<E> getAll();

}