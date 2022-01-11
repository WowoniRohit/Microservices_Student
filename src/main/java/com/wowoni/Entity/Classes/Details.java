package com.wowoni.Entity.Classes;

import com.wowoni.Entity.Student;

public class Details {
	
	private Student student;
	private Subject subject;
	public Details(Student student, Subject subject) {
		super();
		this.student = student;
		this.subject = subject;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	

}
