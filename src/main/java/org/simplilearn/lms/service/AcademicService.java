package org.simplilearn.lms.service;

import java.util.List;

import org.simplilearn.lms.entities.AcademicClass;

public interface AcademicService {
	void addClass(AcademicClass academicclass);
	void deleteClass(AcademicClass academicclass);
	void updateClass(AcademicClass academicclass);
	List<AcademicClass> getClasses();
	AcademicClass get(int cid);
	
	
	
}
