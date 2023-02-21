package com.restdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.model.EmployeeModel;

@RestController
public class EmployeeController {

	public List<EmployeeModel> employees() {
		EmployeeModel e1 = new EmployeeModel(100, "Sagnik", "Kolkata");
		EmployeeModel e2 = new EmployeeModel(101, "Swairik", "Kolkata");
		EmployeeModel e3 = new EmployeeModel(102, "Pragya", "Kolkata");
		EmployeeModel e4 = new EmployeeModel(103, "Rajarshi", "Kolkata");

		List<EmployeeModel> employeeList = Arrays.asList(e1, e2, e3, e4);
		return (employeeList);

	}

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.POST)
	public List<EmployeeModel> getAllEmps() {
		System.out.println("called");
		return employees();
	}
	
//	@RequestMapping(value="/getAllEmployees")
//	public String test() {
//		return("test");
//	}

	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	public EmployeeModel getEmployeeById(@PathVariable int id) {
		List<EmployeeModel> ls = employees();

		for (EmployeeModel e : ls) {
			if (e.getId() == id) {
				return (e);
			}
		}
		return (null);
	}
}
