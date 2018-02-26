package com.sang.java8.lambdaexp.methodreferences;

public class Customer {

	String a;
	String b;
	
	public Customer(String a,String b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public String toString() {
		return a+"-"+b;
	}
}
