package com.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ListInterfacePractice {
	public static void main(String args[]) {
		List< String> list = new ArrayList<>();
		list.add("Sangeetha");
		list.add("Ajay");
		list.add("Ajay");//can contain duplicates
		list.add("Zen");
		list.add(null);//can contain null
		list.add(null);
		System.out.println("Full list-->"+list);//retrieves in the order they are inserted
		
		
		System.out.println("Object at index 1-->"+list.get(1));
		list.add(1, "Sankar");
		System.out.println("After adding Sankar at index 1-->"+list);
		System.out.println("Setting Harsha at index 1-->"+list.set(1, "Harsha"));
		System.out.println("After Setting Harsha at index 1-->"+list);
		list.remove("Ajay");//only first occurrence of the object is removed
		System.out.println("After removing Ajay-->"+list);
		System.out.println("Removing from index 1-->"+list.remove(1));
		System.out.println("After Removing from index 1-->"+list);
		
		
		
	}

}
