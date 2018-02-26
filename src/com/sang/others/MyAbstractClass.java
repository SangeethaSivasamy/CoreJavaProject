package com.sang.others;

public abstract class MyAbstractClass {
	
	String name;
	final static String name1 = "Sangeetha";
	
	public MyAbstractClass() {
		
	}
	
	public abstract void method1();
	
	public static void method2() {
		System.out.println("method2");
	}
	
	public void method3() {
		System.out.println("method3");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main");
		//MyAbstractClass abstractClass = new MyAbstractClass(); // exception
		
	}
}
