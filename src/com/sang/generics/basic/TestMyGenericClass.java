package com.sang.generics.basic;



public class TestMyGenericClass {
public static void main(String[] args) {
	MyGenericClass<Integer> myGenericClass1 = new MyGenericClass(33);
	MyGenericClass<String> myGenericClass2 = new MyGenericClass("Sangeetha");
	
	myGenericClass1.showType();
	myGenericClass2.showType();
	
	int num = myGenericClass1.getObject();
	System.out.println(num);
	
	String name = myGenericClass2.getObject();
	System.out.println(name);
	
	/*int num1 = myGenericClass2.getObject();
	System.out.println(num1);*/
	
}
}
