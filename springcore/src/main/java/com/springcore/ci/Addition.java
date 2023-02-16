package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	private int c;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("inside int int constructor");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("inside double double constructor");
	}

	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("inside string string constructor");
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}

}
