package com.sang.collection.map;


public class Student {

	Student(int rollNo,String name, int age){
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	private int rollNo;
	private String name;
	private int age;

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.getRollNo()+"-"+this.getName()+"-"+this.getAge();
	}

	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		if(this.getRollNo()==s.getRollNo() && this.getAge()==s.getAge() && this.getName().equals(s.getName()))
			return true;
		else 
			return false;
	}

}
