package org.simplilearn.lms.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class AcademicClass {
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	private int cid;
	private String name;
	private String duration;
	@ManyToMany(mappedBy = "classes",cascade=CascadeType.ALL)
	private Set<Subject> subjects=new HashSet<>();
	@OneToMany(mappedBy="academicclass",cascade=CascadeType.ALL)
	private Set<Student> student=new HashSet<>(); 
	
	
	
	public AcademicClass(int cid, String name, String duration, Set<Subject> subjects, Set<Student> student) {
		super();
		this.cid = cid;
		this.name = name;
		this.duration = duration;
		this.subjects = subjects;
		this.student = student;
	}
	public AcademicClass() {
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Set<Subject> getSubject() {
		return subjects;
	}
	public void setSubject(Set<Subject> subject) {
		this.subjects = subject;
	}
	//Helper methods
	public void addSubject(Subject subject)
	{
		subjects.add(subject);
	}
	
	
}
