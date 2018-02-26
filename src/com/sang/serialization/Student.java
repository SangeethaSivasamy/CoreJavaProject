package com.sang.serialization;

import java.io.Serializable;

public class Student implements Serializable{
String name;
transient String age;
Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"-"+age;
	}
}
