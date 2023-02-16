package com.spring.ormDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Model.Student;
import com.spring.orm.dao.StudentDao;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ormDemo/config.xml");
		StudentDao sd = context.getBean("studentDao",StudentDao.class);
		Student s = new Student();
		s.setId(100);
		s.setName("Sagnik");
		s.setCity("Kol");
		
		//System.out.println( sd.insert(s) );
		
//		System.out.println( sd.getAllById() );
//		
//		System.out.println( sd.getById(100) );
		
//		sd.modify(s);
		sd.delete(s);
	}

}
