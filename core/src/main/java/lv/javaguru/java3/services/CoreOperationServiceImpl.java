package lv.javaguru.java3.services;

import lv.javaguru.java3.database.CRUDOperationDAO;
import lv.javaguru.java3.domain.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public abstract class CoreOperationServiceImpl<E extends BaseEntity,K , D extends CRUDOperationDAO<E,K>>
                                     implements CoreOperationService<E, K, D> {

    @Autowired
    protected D dao;

    @Override
    public E get(K key) {
        return dao.getRequired(key);
    }

    @Override
    public List<E> getAll() {
        return dao.getAll();
    }

    @Override
    public void delete(K key){
        E entity = dao.getRequired(key);
        dao.delete(entity);
    }
}
