package com.springcore.aspect;

public class PaymentServiceImplementation implements PaymentService {

	public void makePayment() {
		System.out.println("amount debited");
		//Business Logic
		System.out.println("amount credited");
	}
	
}
