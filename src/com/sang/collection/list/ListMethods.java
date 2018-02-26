package com.sang.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("B");
		System.out.println(arrayList);
		
		arrayList.add(1, "AA");
		System.out.println(arrayList);
		
		arrayList.remove("C");
		
		arrayList.remove(3);
		
		arrayList.indexOf("AA");
		
		arrayList.contains("B");
		
		arrayList.get(2);
		
		//compare two lists
		ArrayList<Student> arrayList2 = new ArrayList<>();
		arrayList2.add(new Student(1, "AAAA", 20));
		arrayList2.add(new Student(4, "AAAA", 20));
		arrayList2.add(new Student(5, "BBBB", 20));
		
		ArrayList<Student> arrayList3 = new ArrayList<>();
		arrayList3.add(new Student(1, "AAAA", 20));
		arrayList3.add(new Student(4, "AAAA", 20));
		arrayList3.add(new Student(5, "BBBB", 20));
		
		System.out.println(arrayList2.equals(arrayList3));
		
		
		ArrayList<String> arrayList4 = new ArrayList<>();
		arrayList4.add("A");
		arrayList4.add("A");
		arrayList4.add("C");
		arrayList4.add("A");
		arrayList4.add("B");
		
		
		ArrayList<String> arrayList5 = new ArrayList<>();
		arrayList5.add("A");
		arrayList5.add("A");
		arrayList5.add("C");
		arrayList5.add("A");
		arrayList5.add("B");
		System.out.println(arrayList4.equals(arrayList5));
		
		
		
		
	}
}
