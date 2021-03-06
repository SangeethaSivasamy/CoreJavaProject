package com.collectionpractice;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterfacePractice {
public static void main(String args[]) {
	Set< Integer> set = new HashSet<>();
	
	set.add(100);
	set.add(200);
	set.add(500);
	set.add(300);
	set.add(700);
	set.add(600);
	set.add(400);
	//set.add(null);//can contain null. But Exception thrown while sorting
	//set.add(null);
	
	System.out.println("Full set-->"+set);//no order maintained
	
	set.add(400);//no duplicates allowed. No exception throws. simply returns false
	System.out.println("After adding duplicates-->"+set);
	
	SortedSet<Integer> sortedSet = new TreeSet<>(set);//to sort the set
	System.out.println("After sorting-->"+sortedSet);
	
	System.out.println("headSet-->"+sortedSet.headSet(300));
	System.out.println("tailSet-->"+sortedSet.tailSet(600));
	
	NavigableSet< Integer> navigableSet = new TreeSet<>(set);
	System.out.println(navigableSet.ceiling(350));
	System.out.println(navigableSet.floor(450));
	System.out.println("pollFirst-->"+navigableSet.pollFirst());
	System.out.println("pollLast-->"+navigableSet.pollLast());
	System.out.println("Final navigableSet-->"+navigableSet);
	System.out.println("Final set-->"+set);
	
	
}
}
