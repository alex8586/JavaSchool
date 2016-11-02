package lv.javaguru.java3.core.database.vehicle;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.Vehicle;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

@Component
public class VehicleDAOImpl extends CRUDOperationDAOImpl<Vehicle, Long> implements VehicleDAO {

    @Override
    public Vehicle getByCode(String code){
        return  (Vehicle) getCurrentSession()
                .createCriteria(daoType)
                .add( Restrictions.eq( "carCode", code))
                .uniqueResult();
    }
}
