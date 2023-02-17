package com.mvcValidationDemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Employee {
	
	@Size(min=3,message = "Must be a valid name")
	private String name;
	
	//@Size(min=4,message = "Password must be 4 characters long")
	//@Pattern(regexp = "",message = "Invalid password")
	@Password
	private String password;
	
	@Positive(message="age cannot be negative")
	@Min(value=18, message="age should  be >=18")
	@Max(value=200 , message="Invalid age")
	private int age;
	
	/**
	 * Other includes positiveorzero,negative,email etc...
	 */
	public Employee() {
		super();
	}

	public Employee(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", age=" + age + "]";
	}

}
