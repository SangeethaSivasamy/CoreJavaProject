package com.sang.collection.list.api;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		Student student0 = new Student(0, "AAAA", 28);
		Student student1 = new Student(1, "BBBB", 30);
		Student student2 = new Student(2, "CCCC", 27);
		Student student3 = new Student(3, "DDDD", 26);
		Student student4 = new Student(4, "EEEE", 27);
		LinkedList<Student> linkedList = new LinkedList<>();
		linkedList.add(student0);
		linkedList.add(student1);
		linkedList.add(student2);
		linkedList.add(student3);
		linkedList.add(student4);
		System.out.println(linkedList);
		System.out.println("--------------------------");
		
		/*Iterator<Student> iterator = linkedList.descendingIterator();
		System.out.println("descendingIterator::");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		linkedList.addFirst(new Student(10,"ten",10));
		linkedList.addLast(new Student(11,"eleven",11));
		/*System.out.println(linkedList.remove());
		System.out.println(linkedList.removeFirst());*/
		/*linkedList.push(new Student(12,"twelve",12));
		linkedList.push(new Student(13,"thirteen",13));
		print(linkedList);
		System.out.println("------------peek--------------");
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peek());
		System.out.println(linkedList.pop());*/
		
		linkedList.offer(new Student(21,"tewntyone",21));
		linkedList.offer(new Student(22,"tewntytwo",22));
		print(linkedList);
		System.out.println(linkedList.poll());
		System.out.println(linkedList.pollLast());
		print(linkedList);
		
	}
	
	
	public static void print(LinkedList<Student> linkedList) {
		ListIterator<Student>  listIterator = linkedList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.nextIndex()+","+listIterator.next());
		}
		System.out.println("----------------------------------------");
	}
}
