package com.spring.DemoMvc.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.DemoMvc.dao.EmployeeDao;
import com.spring.DemoMvc.model.Employee;

@Controller
public class EmployeeController {
	
	private int id;
	
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
		m.addAttribute("list",list) ;
		return("/viewForm");
	}
	
	@RequestMapping(value="/employeeEdit/{id}")
	public String showEditForm( @PathVariable(value="id") int id, Model model ) {
		model.addAttribute("command" , new Employee());
		this.id = id;
		return( "employeeEdit" );
	}
	
	@RequestMapping(value="/employeeEdit/modify" , method = RequestMethod.POST)
	public String modify( @ModelAttribute("Employee") Employee employee) {
		//System.out.println(id+"working");
		employee.setId(this.id);
		//System.out.println(employee);
		this.emplDao.update(employee);
		return( "redirect:/viewForm");
	}
	
	@RequestMapping(value="/employeeDelete/{id}" , method=RequestMethod.GET)
	public String delete( @PathVariable int id) {
		this.emplDao.delete(id);
		return( "redirect:/viewForm");
	}

}
