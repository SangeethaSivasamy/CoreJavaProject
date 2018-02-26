package com.sang.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

//import com.comparator.StudentNameComparator;

public class SetTest {
	public static void main(String[] args) {
		//SortedSet<String> set = new TreeSet<>(new StudentNameComparator());
		
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(20);
		set.add(4);
		set.add(7);
		set.add(27);
		set.add(89);
		set.add(12);
		System.out.println(set);
		
		System.out.println(set.ceiling(3));
		
		System.out.println(set.floor(3));
		
		
System.out.println(set.higher(3));
		
		System.out.println(set.lower(3));
	}
}
