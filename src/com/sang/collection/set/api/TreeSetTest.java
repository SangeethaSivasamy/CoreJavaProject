package com.sang.collection.set.api;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		
		Student student0 = new Student(0, "AAAA", 28);
		Student student1 = new Student(1, "BBBB", 30);
		Student student2 = new Student(2, "CCCC", 27);
		Student student3 = new Student(3, "DDDD", 26);
		Student student4 = new Student(4, "EEEE", 27);
		
		Student student01 = new Student(0, "AAAA", 28);
		Student student11 = new Student(1, "BBBB", 30);
		Student student21 = new Student(2, "CCCC", 27);
		Student student31 = new Student(3, "DDDD", 26);
		Student student41 = new Student(4, "EEEE", 27);
		SortedSet<Student> set = new TreeSet<>();
		set.add(student0);
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		//set.add(null);
		
		Set<Student> subset = set.subSet(student1, student3);
		subset.add(new Student(21,"twentyone",21));
		System.out.println(subset);
		
		
		
	}
}
