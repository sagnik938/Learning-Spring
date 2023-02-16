package com.spring.jdbcDemo;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbcDemo.Dao.StudentDaoImpl;
import com.spring.jdbcDemo.model.Student;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbcDemo/config.xml");
		Student s = new Student();
		s.setId(101);
		s.setName("swairik");
		s.setCity("Kolkata");
		StudentDaoImpl sd = (StudentDaoImpl) context.getBean("studentDao");
		//sd.insert(s);
		
		Student modifiedStudent = new Student();
		modifiedStudent.setId(101);
		modifiedStudent.setName("Bruh");
		modifiedStudent.setCity("Delhi");
//		System.out.println(sd.modify(modifiedStudent));
		
//		System.out.println( sd.delete(104) );
		
		try {
			System.out.println( sd.getStudent(103) );
//			System.out.println( sd.getStudent(109) );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Student> studentList = sd.getAllStudent();
		for( Student elem : studentList) {
			System.out.println(elem + "\n");
		}
	}
}
