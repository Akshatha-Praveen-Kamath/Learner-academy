package org.simplilearn.lms.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.lms.Config.HibConfig;
import org.simplilearn.lms.entities.User;

public class SavedUserLoginDaoImpl implements SavedUserLoginDao{

	@Override
	public void insert(User user) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
		
	
