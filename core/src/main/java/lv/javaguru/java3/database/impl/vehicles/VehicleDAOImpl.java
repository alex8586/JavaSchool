package lv.javaguru.java3.database.impl.vehicles;

import lv.javaguru.java3.database.api.vehicles.VehicleDAO;
import lv.javaguru.java3.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.domain.vehicles.Vehicle;
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
