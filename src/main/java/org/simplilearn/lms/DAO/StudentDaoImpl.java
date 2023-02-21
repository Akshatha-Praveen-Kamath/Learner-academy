package org.simplilearn.lms.DAO;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.lms.Config.HibConfig;
import org.simplilearn.lms.entities.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void insert(Student student) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(student);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> getAll() {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Query<Student> query=session.createQuery("select s from org.simplilearn.lms.entities.Student s");
		session.close();
		//return query.list();
		return getAll();
	}

	@Override
	public Student get(int sid) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Student student=session.get(Student.class, sid);
		session.close();
		return student;
	}

	@Override
	public void delete(Student student) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(student);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Student student) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(student);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	} 
}
