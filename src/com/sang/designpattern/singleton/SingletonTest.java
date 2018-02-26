package com.sang.designpattern.singleton;

public class SingletonTest {
public static void main(String[] args) {
	System.out.println("calling getInstance()");
	Singleton singletonObj = Singleton.getInstance();
	System.out.println(singletonObj);
	
	System.out.println("calling getInstance() again");
	Singleton singletonObj1 = Singleton.getInstance();
	System.out.println(singletonObj1);
}
}
