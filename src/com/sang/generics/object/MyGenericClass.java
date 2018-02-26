package com.sang.generics.object;

public class MyGenericClass {
	private Object obj;
	
	public MyGenericClass(Object obj) {
		this.obj=obj;
	}
	
	public Object getObject() {
		return obj;
	}
	
	public void showType() {
		System.out.println(obj.getClass().getName());
	}
}
