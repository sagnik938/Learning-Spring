package com.springsecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	//Authentication manager builder
	//in server memory auth
	//username , pass , roles
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth
		.inMemoryAuthentication()
		.withUser("sagniks")
		.password("{noop}1234")
		.roles("ADMIN");
	}
}
