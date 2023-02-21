package com.spring.DemoMvc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;


public class Employee {

	private int id;
	@NotBlank(message = "name cannot be blank")
	private String name;

	@PositiveOrZero(message = "Salary must be positive")
	private int salary;

	@NotBlank(message = "designation cannot be blank")
	private String designation;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
}
