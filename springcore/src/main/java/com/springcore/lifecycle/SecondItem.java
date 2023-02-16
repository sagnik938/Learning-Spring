package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SecondItem implements InitializingBean , DisposableBean {
	private double price;

	public SecondItem(double price) {
		super();
		this.price = price;
	}

	public SecondItem() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting 2nd Item price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "SecondItem [price=" + price + "]";
	}
	
	/*init method*/
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome initialistaion done");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Work done destroying");
		
	}
	
	
}
