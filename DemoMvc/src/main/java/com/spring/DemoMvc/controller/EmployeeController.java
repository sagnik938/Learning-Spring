package com.spring.DemoMvc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.DemoMvc.dao.EmployeeDao;
import com.spring.DemoMvc.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao emplDao;
	
	@RequestMapping("/employeeForm")
	public String showForm(Model model) {
		model.addAttribute("command" , new Employee());
		return( "employeeForm");
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save( @ModelAttribute("Employee") Employee employee ) {
		int r = this.emplDao.save(employee);
		return ("redirect:/viewForm");
		
	}
	
	@RequestMapping(value="/viewForm")
	public String viewEmpl(Model m) {
		List<Employee> list = this.emplDao.getAllEmpl();
		m.addAttribute(list) ;
		return("viewForm");
	}
	
	@RequestMapping(value="/employeeEdit" , method = RequestMethod.POST)
	public String modify( @ModelAttribute("Employee") Employee employee) {
		this.emplDao.update(employee);
		return( "redirect:/viewEmpl");
	}
	
	@RequestMapping(value="/employeeDelete/{id}" , method=RequestMethod.POST)
	public String delete( @PathVariable int id) {
		this.emplDao.delete(id);
		return( "redirect:/viewEmpl");
	}

}
