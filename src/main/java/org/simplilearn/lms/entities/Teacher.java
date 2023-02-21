package org.simplilearn.lms.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int tid;
	private String name;
	private String designation;
	private String skill;
	@OneToMany(mappedBy = "teacher",cascade=CascadeType.ALL)
	private Set<Subject> subjects = new HashSet<>();
	
	
	
	
	//If Teacher wants to add new subject
	//Helper method
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	public void addSubject(Subject subject)
	{
		subjects.add(subject);
	}
	public void removeSubject(Subject subject)
	{
		subjects.remove(subject);
	}
}
