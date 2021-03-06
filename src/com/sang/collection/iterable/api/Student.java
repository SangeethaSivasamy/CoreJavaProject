package com.sang.collection.iterable.api;



public class Student implements Comparable<Student>
{

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
	@Override
	public int compareTo(Student o) {
		return this.rollNo<o.rollNo?-1:this.rollNo>o.rollNo?1:0;
	}
	
	/*@Override
	public int compareTo(Student o) {
		return this.age<o.age?-1:this.age>o.age?1:0;
	}*/
	
	public String toString() {
		return this.getRollNo()+"-"+this.getName()+"-"+this.getAge();
	}
}
