package com.sang.generics.boundedtypes;

public class TestMyBoundedGenericClass {
public static void main(String[] args) {
	Integer[] intarr = {1,2,3,4,5};
	MyBoundedGenericClass1<Integer> boundedGenericClass1 = new MyBoundedGenericClass1<>(intarr);
	
	Double[] doubarr= {1.0,3.5,7.5};
	MyBoundedGenericClass1<Double> boundedGenericClass2 = new MyBoundedGenericClass1<>(doubarr);
	
	System.out.println(boundedGenericClass1.calculateAverage());
	System.out.println(boundedGenericClass2.calculateAverage());
	
	String[] strarr= {"Sangeetha","Sankar"};
	MyBoundedGenericClass1<String> boundedGenericClass3 = new MyBoundedGenericClass1<>(strarr);
	
	
}
}
