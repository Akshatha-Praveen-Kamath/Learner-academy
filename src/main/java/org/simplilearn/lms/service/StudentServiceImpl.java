package org.simplilearn.lms.service;
import java.util.List;
import org.simplilearn.lms.DAO.StudentDao;
import org.simplilearn.lms.DAO.StudentDaoImpl;
import org.simplilearn.lms.entities.Student;

public class StudentServiceImpl implements StudentServices {
	private StudentDao dao=new StudentDaoImpl();
	@Override
	public void addStudent(Student student) {
		dao.insert(student);	
	}
	@Override
	public void deleteStudent(Student student) {
		dao.delete(student);
	}
	@Override
	public List<Student> getStudents() {
		return dao.getAll();
	}
	@Override
	public void updateStudent(Student student) {
		dao.update(student);
		
	}


}
