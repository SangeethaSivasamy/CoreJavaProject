package com.sang.cloning;

public class Student implements Cloneable{
String name;
String age;
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

//shallow copy
/*public Object clone() throws CloneNotSupportedException {
	return super.clone();
}*/

//deep copy
public Object clone() throws CloneNotSupportedException {
	Student student = (Student) super.clone();
	student.address = (Address)address.clone();
	return student;
}


}
