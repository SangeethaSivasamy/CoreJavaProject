package com.sang.cloning;

public class TestCloning {
public static void main(String[] args) {
	Student studentori = new Student();
	studentori.setName("Sangeetha");
	studentori.setAge("20");
	
	Address address = new Address();
	address.setBuildingno("21");
	address.setCity("Coimbatore");
	studentori.setAddress(address);
	
	
	try {
		Student studentclone =  (Student)studentori.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
