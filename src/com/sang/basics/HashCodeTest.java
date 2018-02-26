package com.sang.basics;

public class HashCodeTest {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Sangeetha", 21);
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		
		Student s2 = new Student(1, "Sangeetha", 21);
		System.out.println(s2.hashCode());
		
		
		s2=s1;
		System.out.println(s2.hashCode());
		
		
		s1.setAge(17);
		s1.setName("Ajay");
		System.out.println(s1.hashCode());
		
		
		
		
		
	}
	
	
}
