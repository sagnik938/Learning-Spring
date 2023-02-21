package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {
	
	@GetMapping(value = "/learning")
	public String hello() {
		return( "learning");
	}
	
	@GetMapping(value = "/test1")
	@ResponseBody
	public String test1() {
		return("hi from test 1");
	}
	
	@GetMapping(value = "/test2/{name}")
	@ResponseBody
	public String test2(@PathVariable String name) {
		return("hi from test 2 "+name);
	}

}
