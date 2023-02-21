package org.simplilearn.lms.service;

import java.util.List;
import org.simplilearn.lms.DAO.SubjectDao;
import org.simplilearn.lms.DAO.SubjectDaoImpl;
import org.simplilearn.lms.entities.Subject;

public class SubjectServicesImpl implements SubjectServices {
	private SubjectDao dao=new SubjectDaoImpl();
	@Override
	public void addSubject(Subject subject) {
		dao.insert(subject);
	}
	@Override
	public List<Subject> getSubjects() {
		return dao.getAll();
	}
	@Override
	public void deleteSubject(Subject subject) {
		dao.delete(subject);
		
	}
	
}
