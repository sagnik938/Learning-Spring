package com.springcore.PersonAssignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	@Value("100")
	private int id;
	@Value("Person1")
	private String pName;
	@Value("Junior")
	private String designation;
	@Value("#{conList}")
	private List<String> contactNo;
	@Value("#{projList}")
	private List<String> projects;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<String> getContactNo() {
		return contactNo;
	}
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pName=" + pName + ", designation=" + designation + ", contactNo=" + contactNo
				+ ", projects=" + projects + "]";
	}
}
