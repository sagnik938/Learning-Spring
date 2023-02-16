package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./com/springcore/ci/ciConfig.xml");

//		Certi c = (Certi) context.getBean("certi");
//		System.out.println(c);
//
//		Person p = (Person) context.getBean("person");
//		System.out.println(p);
//
//		Certi c2 = (Certi) context.getBean("certi2");
//		System.out.println(c2);
//
//		Person p2 = (Person) context.getBean("person2");
//		System.out.println(p2);

		Addition a = (Addition) context.getBean("add");
		System.out.println(a);

		Addition a2 = (Addition) context.getBean("add2");
		System.out.println(a2);

	}

}
