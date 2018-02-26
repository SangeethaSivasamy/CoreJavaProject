package com.sang.collection.list.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;



public class ArrayListTest {

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
		Set<Student> set = new HashSet<>();
		set.add(student01);
		set.add(student11);
		set.add(student21);
		set.add(student31);
		set.add(student41);
		
		
		List<Student> arrayList = new ArrayList<>();
		arrayList.add(student0);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		
		/*print(arrayList);
		
		System.out.println("size:"+arrayList.size());
		arrayList.add(5,new Student(11, "Sangeetha", 28));
		print(arrayList);
		
		arrayList.set(2, student4);
		print(arrayList);*/
		
		//arrayList.remove(student2);
		//arrayList.remove(2);
		//arrayList.removeIf(n->n.getAge()>=30);
		//arrayList.removeRange(2,4);
		//arrayList.subList(2, 4).clear();
		/*arrayList.replaceAll(n->{
			n.setAge(n.getAge()+10);
			return n;
		});*/
		//System.out.println(arrayList.get(1));
		/*Student s  = new Student(50,"E",70);
		Student s1  = new Student(4, "EEEE", 27);
		Student s2  = student4;
		s2.setName("name");
		
		System.out.println(arrayList.contains(s));
		System.out.println(arrayList.contains(s1));
		System.out.println(arrayList.contains(s2));*/
		
		/*arrayList.clear();
		arrayList.add(student4);*/
		
		//arrayList.sort(new StudentNameComparator());
		
		//System.out.println(arrayList.subList(1, 5));
		
		//Student[] arr = (Student[])arrayList.toArray();
		/*Student[] arr = new Student[arrayList.size()];
		arrayList.toArray(arr);
		System.out.println("Array::");
		for(Student s:arr) {
			System.out.println(s);
		}*/
		
		//System.out.println(arrayList.containsAll(set));
		
		
		
		print(arrayList);
		
		List<Student> sublist = arrayList.subList(1, 3);
		sublist.add(new Student(21,"twentyone",21));
		System.out.println(sublist);
		print(arrayList);
		
	}
	
	public static void print(List<Student> arrayList) {
		ListIterator<Student>  listIterator = arrayList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.nextIndex()+","+listIterator.next());
		}
		System.out.println("----------------------------------------");
	}
}
