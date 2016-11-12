package lv.javaguru.java3.services;

import lv.javaguru.java3.database.CRUDOperationDAO;
import lv.javaguru.java3.domain.BaseEntity;

import java.util.List;


public interface CoreOperationService<E extends BaseEntity,K , D extends CRUDOperationDAO<E,K>>{
    E get(K key);
    List<E> getAll();
    void delete(K key);
}
