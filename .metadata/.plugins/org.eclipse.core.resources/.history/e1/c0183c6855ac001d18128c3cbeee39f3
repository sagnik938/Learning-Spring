package com.springcore.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/aspect/config.xml");
		PaymentService paymentObj = context.getBean("payment",PaymentService.class);
		paymentObj.makePayment();

	}

}
