package com.sang.collection.iterable.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyIteratorTest {
public static void main(String[] args) {
	
	Student student1 = new Student(1, "Sangeetha", 28);
	Student student2 = new Student(2, "Sankar", 30);
	Student student3 = new Student(3, "Harsha", 27);
	Student student4 = new Student(4, "Ajay", 26);
	Student student5 = new Student(5, "Raghu", 27);
	List<Student> list = new ArrayList<>();
	list.add(student1);
	list.add(student5);
	list.add(student3);
	list.add(student4);
	list.add(student2);
	
	Iterator<Student> iterator = list.iterator();
	//iterator.forEachRemaining(n->System.out.println("foreachremaining:"+n));//sinceit took all the data, hasNext() will be false
	while(iterator.hasNext()) {
		Student s = iterator.next();
		System.out.println("next:"+s);
		if(s.getRollNo()==3) {
			iterator.remove();
		}
	}
	System.out.println(list);//rollno 3 will be removed
	
	//iterator.forEachRemaining(n->System.out.println("foreachremaining:"+n));//since next() took all the data, this will be empty
	
}
}
