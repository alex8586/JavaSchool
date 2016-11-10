package lv.javaguru.java3.databasetmp;

import lv.javaguru.java3.database.CRUDOperationDAO;
import lv.javaguru.java3.config.CoreConfig;
import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {CoreConfig.class})
public abstract class DatabaseHibernateTest<Dao extends CRUDOperationDAO> {

	@Autowired
	protected SessionFactory sessionFactory;

	@Autowired
	protected Dao dao;

}
