package com.sang.constructors;

public class ConstructorTest {
	ConstructorTest(){
		return;
	}
	
	
	public int ConstructorTest(int i) {
		i=10;
		return i;
	}
	
	public static void main(String[] args) {
		ConstructorTest c = new ConstructorTest();
		int j=c.ConstructorTest(0);
		System.out.println(j);
	}
}
