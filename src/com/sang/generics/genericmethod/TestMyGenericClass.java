package com.sang.generics.genericmethod;

import java.util.ArrayList;
import java.util.List;

public class TestMyGenericClass {
public static void main(String[] args) {
	List<String>  list = new ArrayList<>();
	list.add("Sangeetha");
	
	MyGenericClass myGenericClass = new MyGenericClass("name", 29);
	myGenericClass.addEle("Sankar", list);
	
	System.out.println(list);
	
	
	
	List<Integer>  list1 = new ArrayList<>();
	list1.add(1);
	
	MyGenericClass myGenericClass2 = new MyGenericClass("name", 29);
	myGenericClass.addEle(2,list1);
	
	System.out.println(list1);
	
}
}
