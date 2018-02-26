package com.sang.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompareHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "A");
		hashmap.put(5, "B");
		hashmap.put(7, "D");
		hashmap.put(4, "E");
		hashmap.put(2, "F");
		
		
		HashMap<Integer, String> hashmap2 = new HashMap<>();
		hashmap2.put(1, "A");
		hashmap2.put(5, "B");
		hashmap2.put(7, "D");
		hashmap2.put(2, "F");
		hashmap2.put(4, "E");
		
		
		
		//System.out.println(hashmap.equals(hashmap2));
		//System.out.println(hashmap == hashmap2);
		
		
		HashMap<Customer, Student> hashmap4 = new HashMap<>();
		hashmap4.put(new Customer("customer1"), new Student(1,"student1",17));
		hashmap4.put(new Customer("customer2"), new Student(2,"student2",18));
		
		HashMap<Customer, Student> hashmap5 = new HashMap<>();
		
		hashmap5.put(new Customer("customer2"), new Student(2,"student2",18));
		hashmap5.put(new Customer("customer1"), new Student(1,"student1",17));
		
		
		
	}
	
	public final boolean equals(Object o) {
        if (o == this)
            return true;
        if (o instanceof Map.Entry) {
            Map.Entry<?,?> e = (Map.Entry<?,?>)o;
            if (Objects.equals(key, e.getKey()) &&
                Objects.equals(value, e.getValue()))
                return true;
        }
        return false;
    }
	
	public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
}
