package org.simplilearn.lms.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.lms.Config.HibConfig;
import org.simplilearn.lms.entities.Teacher;


public class TeacherDaoImple implements TeacherDao {

	@Override
	public void insert(Teacher teacher) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try 
		{
			tx=session.beginTransaction();
			session.save(teacher);
			tx.commit();
			session.close();
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public List<Teacher> getALL() {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Query<Teacher> query=session.createQuery("select t from org.simplilearn.lms.entities.Teacher t");
		session.close();
		return query.list();
	}

	@Override
	public void delete(Teacher tid) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(tid);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(Teacher teacher) {
		SessionFactory factory = HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try 
		{
			tx=session.beginTransaction();
			session.save(teacher);
			tx.commit();
			session.close();
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public Teacher get(int tid) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Teacher teacher=session.get(Teacher.class, tid);
		session.close();
		return teacher;
	}

	@Override
	public Teacher get(String name) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Query<Teacher> query=session.createQuery("select t from org.simplilearn.lms.entities.Teacher t where name=?1");
		query.setParameter(1, name);
		session.close();
		return query.getSingleResult();
	}
	
}
