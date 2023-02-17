package com.mvcValidationDemo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/welcome")
	public String loadForm(Model m) {
		m.addAttribute("emp" , new Employee());
		return( "viewform" );
	}
	
	@RequestMapping("/submit")
	public String submit( @Valid @ModelAttribute("emp") Employee emp, BindingResult br , Model m) {
		if(br.hasErrors()) {
			return("viewform");
		}
		m.addAttribute("emp",emp);
		return("display");
	}
}
