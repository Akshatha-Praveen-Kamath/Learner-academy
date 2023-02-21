package org.simplilearn.lms.DAO;

import java.util.List;

import org.simplilearn.lms.entities.AcademicClass;

public interface AcademicClassDao {
	void insert(AcademicClass academicclass);
	List<AcademicClass> getAll();
	AcademicClass get(int cid);
	void delete(AcademicClass academicclass);
	void update(AcademicClass academicclass);
}
