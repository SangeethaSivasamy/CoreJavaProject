package com.sang.generics.object;

public class TestMyGenericClass {
public static void main(String[] args) {
	MyGenericClass myGenericClass1 = new MyGenericClass(33);
	MyGenericClass myGenericClass2 = new MyGenericClass("Sangeetha");
	
	myGenericClass1.showType();
	myGenericClass2.showType();
	
	int num = (Integer)myGenericClass1.getObject();
	System.out.println(num);
	
	String name = (String)myGenericClass2.getObject();
	System.out.println(name);
	
	int num1 = (Integer)myGenericClass2.getObject();
	System.out.println(num1);
	
}
}
