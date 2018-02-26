package com.sang.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerializationTest {
public static void main(String[] args) {
	try {
		
		Student studentori = new Student();
		studentori.setName("Sangeetha");
		studentori.setAge("20");
		
		Address address = new Address();
		address.setBuildingno("21");
		address.setCity("Coimbatore");
		studentori.setAddress(address);
		
		
	File file = new File("/Users/sangeetha/Documents/Everything/MyApplicationOutputs/serialized.ser");
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
	objectOutputStream.writeObject(studentori);
	objectOutputStream.close();
	
	
	ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
	Student newstudent = (Student)objectInputStream.readObject();
	System.out.println(newstudent.getName());
	System.out.println(newstudent.getAge());
	System.out.println(newstudent.getAddress().toString());
	objectInputStream.close();
	
	
	} catch (Exception e) {
		// TODO: handle exception
	}

	
}
}
