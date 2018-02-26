package com.sang.generics.genericmethod;

import java.util.List;

public class MyGenericClass {
private String name;
private int age;

public MyGenericClass(String name,int age) {
	// TODO Auto-generated constructor stub
	this.name = name;
	this.age = age;
}
//Generic Method
public <T> List<T> addEle(T el,List<T> list) {
	list.add(el);
	return list;
}

}
