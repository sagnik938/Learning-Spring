package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student_1") 
class Student {
	@Value("Sagnik")
	private String studentName;
	
	@Value("Kolkata")
	private String city;
	
	@Value("#{alist}")
	private List<Integer> marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	
	public Student(String studentName, String city, List<Integer> marks) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.marks = marks;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", marks=" + marks + "]";
	}
}
