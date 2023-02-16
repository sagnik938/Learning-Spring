package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterItem {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/configlifecycle.xml");
//		Item item1=(Item)context.getBean("Item1");
//		System.out.println(item1);
//		context.registerShutdownHook();
		
		
//		SecondItem item2=(SecondItem)context.getBean("Item2");
//		System.out.println(item2);
//		context.registerShutdownHook();
		
		Student s1=(Student)context.getBean("student1");
		System.out.println(s1);
		context.registerShutdownHook();
		
	}
}
