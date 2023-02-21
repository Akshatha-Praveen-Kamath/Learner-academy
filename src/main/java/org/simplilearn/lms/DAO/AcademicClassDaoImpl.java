package org.simplilearn.lms.DAO;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.simplilearn.lms.Config.HibConfig;
import org.simplilearn.lms.entities.AcademicClass;

public class AcademicClassDaoImpl implements AcademicClassDao {

	@Override
	public void insert(AcademicClass academicclass) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(academicclass);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public List<AcademicClass> getAll() {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Query<AcademicClass> query=session.createQuery("select a from org.simplilearn.lms.entities.AcademicClass a");
		session.close();
		return query.list();
	}

	@Override
	public AcademicClass get(int cid) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		AcademicClass academicclass=session.get(AcademicClass.class, cid);
		session.close();
		return academicclass;
	}

	@Override
	public void delete(AcademicClass academicclass) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(academicclass);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(AcademicClass academicclass) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(academicclass);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}	
	}
}
