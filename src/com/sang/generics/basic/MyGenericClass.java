package com.sang.generics.basic;

public class MyGenericClass<T> {
	private T obj;
	
	public MyGenericClass(T obj) {
		this.obj=obj;
	}
	
	public T getObject() {
		return obj;
	}
	
	public void showType() {
		System.out.println(obj.getClass().getName());
	}
}
