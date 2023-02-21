package org.simplilearn.lms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	private String address;
	private int age;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private AcademicClass academicclass;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String address, int age, AcademicClass academicclass) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.age = age;
		this.academicclass = academicclass;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AcademicClass getAcademicclass() {
		return academicclass;
	}
	public void setAcademicclass(AcademicClass academicclass) {
		this.academicclass = academicclass;
	}
	
}
