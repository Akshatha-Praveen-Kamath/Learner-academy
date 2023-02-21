package org.simplilearn.lms.service;

import java.util.List;

import org.simplilearn.lms.DAO.AcademicClassDao;
import org.simplilearn.lms.DAO.AcademicClassDaoImpl;
import org.simplilearn.lms.entities.AcademicClass;

public class AcademicServiceImpl implements AcademicService {
	private AcademicClassDao dao=new AcademicClassDaoImpl();
	
	@Override
	public void addClass(AcademicClass academicclass) {
		dao.insert(academicclass);
		
	}

	@Override
	public void deleteClass(AcademicClass academicclass) {
		dao.delete(academicclass);
		
	}

	@Override
	public void updateClass(AcademicClass academicclass) {
		dao.update(academicclass);
		
	}

	@Override
	public List<AcademicClass> getClasses() {
		
		return dao.getAll();
	}

	@Override
	public AcademicClass get(int cid) {
		
		return dao.get(cid);
	}

	public List<AcademicClass> getAll(AcademicClass academicclass) {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	

}
