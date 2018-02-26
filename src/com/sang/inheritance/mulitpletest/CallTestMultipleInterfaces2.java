package com.sang.inheritance.mulitpletest;

public class CallTestMultipleInterfaces2 {

	
	public static void main(String[] args) {
		TestMultipleInterfaces2 testMultipleInterfaces2 = new TestMultipleInterfaces2();
		testMultipleInterfaces2.print();//Ajay
		
		
		InterfaceA interfaceA = new TestMultipleInterfaces2();
		interfaceA.print();//Ajay
		
		
		
		MyClass myClass = new TestMultipleInterfaces2();
		myClass.print();//Ajay
		
	
	}
}
