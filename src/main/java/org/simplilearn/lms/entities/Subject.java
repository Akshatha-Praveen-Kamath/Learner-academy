package org.simplilearn.lms.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="tid")
	private Teacher teacher;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Subject_Class", joinColumns = @JoinColumn(name="sid"),
	inverseJoinColumns = @JoinColumn(name="cid"))
	private Set<AcademicClass> classes=new HashSet<>();	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	//Helper Method
	public void addClass(AcademicClass academicclass)
	{
		classes.add(academicclass);
	}
	public Subject get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
 