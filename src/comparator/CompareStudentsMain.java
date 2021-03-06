package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStudentsMain {
public static void main(String args[]) {
	Student student1 = new Student(1, "Sangeetha", 28);
	Student student2 = new Student(2, "Sankar", 30);
	Student student3 = new Student(3, "Harsha", 27);
	Student student4 = new Student(4, "Aarthy", 26);
	Student student5 = new Student(5, "Raghu", 27);
	
	List< Student> list = new ArrayList<Student>();
	list.add(student1);
	list.add(student5);
	list.add(student3);
	list.add(student4);
	list.add(student2);
	
	System.out.println("Before sorting:");
	for(Student s:list) {
		System.out.println(s);
	}
	//Collections.sort(list);
	
	StudentRollNoComparator rollNoComparator = new StudentRollNoComparator();
	Collections.sort(list, rollNoComparator);
	
	System.out.println("After sorting based on Roll No:");
	for(Student s:list) {
		System.out.println(s);
	}
	
	StudentNameComparator nameComparator = new StudentNameComparator();
	Collections.sort(list, nameComparator);
	System.out.println("After sorting based on Name:");
	for(Student s:list) {
		System.out.println(s);
	}
}
}
