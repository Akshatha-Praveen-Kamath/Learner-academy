package org.simplilearn.lms.service;

import org.simplilearn.lms.DAO.TeacherDao;

import org.simplilearn.lms.DAO.TeacherDaoImple;
import org.simplilearn.lms.entities.Teacher;

public class TeacherServiceImpl implements TeacherService {
	private TeacherDao dao=new TeacherDaoImple();
	@Override
	public void addTeacher(Teacher teacher) {
		dao.insert(teacher);
		
	}
	@Override
	public Teacher getTeacher(String name) {
		return dao.get(name);
	}
	@Override
	public void deleteTeacher(Teacher teacher) {
		dao.delete(teacher);
		
	}

}
