package com.sang.reflection;

import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) {
		Method[] methods = Student.class.getMethods();

		for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}
	}
}
