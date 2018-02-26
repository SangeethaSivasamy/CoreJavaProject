package com.sang.collection.iterable.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyListIteratorTest {
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
		
		ListIterator<Student> listIterator = list.listIterator();
		/*while(listIterator.hasPrevious()) { // This will not print anything because no previous data from the cursor
			Student s = listIterator.previous();
			System.out.println("previous:"+s);
		}*/
		listIterator.add(new Student(11, "AAAA", 40));
		
		
		while(listIterator.hasNext()) {
			int nextIndex = listIterator.nextIndex();
			Student s = listIterator.next();
			System.out.println("next:"+nextIndex+"-"+s);
			if(s.getRollNo()==3) {
				listIterator.remove();
			}
		}
		
		System.out.println("After hasNext:"+list);
		listIterator.forEachRemaining(n->System.out.println("forEachRemaining:"+n));
		while(listIterator.hasPrevious()) {
			int previousIndex = listIterator.previousIndex();
			Student s = listIterator.previous();
			System.out.println("previous:"+previousIndex+"-"+s);
			if(s.getRollNo()==11) {
				s.setName("ABABAB");
				listIterator.set(s);
			}
		}
		
		System.out.println("After hasPrevious:"+list);
		
		listIterator.forEachRemaining(n->System.out.println("forEachRemaining:"+n));
		
		
		//ConcurrentModificationException
		System.out.println("-----------------------------------------------------------");
		Iterator<Student> iterator2 = list.iterator();
		//list.add(new Student(18,"18",18));
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}
}
