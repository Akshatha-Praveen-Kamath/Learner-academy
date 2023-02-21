package org.simplilearn.lms.DAO;

import java.util.List;

import org.simplilearn.lms.entities.Subject;

public interface SubjectDao {
	void insert(Subject subject);
	List<Subject> getAll();
	void delete(Subject sid);
	void update(Subject subject);
	Subject get(int sid);
	
}
