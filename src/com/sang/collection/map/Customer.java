package com.sang.collection.map;

public class Customer {

	String name;
public Customer(String name) {
	this.name = name;
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer c = (Customer)obj;
		if(this.name.equals(c.getName())) return true;
		else return false;
	}
}
