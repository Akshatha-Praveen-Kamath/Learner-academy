package org.simplilearn.lms.DAO;

import java.util.List;

import org.simplilearn.lms.entities.Teacher;

public interface TeacherDao {
	void insert(Teacher teacher);
	List<Teacher> getALL();
	Teacher get(int tid);
	Teacher get(String name);
	void delete(Teacher tid);
	void update(Teacher teacher);
}
