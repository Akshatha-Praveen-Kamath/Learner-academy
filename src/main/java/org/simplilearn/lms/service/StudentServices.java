package org.simplilearn.lms.service;

import java.util.List;

import org.simplilearn.lms.entities.Student;

public interface StudentServices {
	void addStudent(Student student);
	void deleteStudent(Student student);
	void updateStudent(Student student);
	List<Student> getStudents();

}
