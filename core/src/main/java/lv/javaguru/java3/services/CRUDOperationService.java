package lv.javaguru.java3.services;

import lv.javaguru.java3.database.CRUDOperationDAO;
import lv.javaguru.java3.domain.BaseEntity;


public interface CRUDOperationService<E extends BaseEntity,K , D extends CRUDOperationDAO<E,K>> {

}
