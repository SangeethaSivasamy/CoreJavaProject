package com.sang.generics.wildcards;


public class TestMyWildcardGenericClass {
public static void main(String[] args) {
	Integer[] intarr = {1,2,3,4,5};
	MyWildcardGenericClass<Integer> boundedGenericClass1 = new MyWildcardGenericClass<>(intarr);
	
	Double[] doubarr= {1.0,2.0,3.0,4.0,5.0};
	MyWildcardGenericClass<Double> boundedGenericClass2 = new MyWildcardGenericClass<>(doubarr);
	
	Long[] lonarr= {10L,60L};
	MyWildcardGenericClass<Long> boundedGenericClass3 = new MyWildcardGenericClass<>(lonarr);
	
	System.out.println(boundedGenericClass1.calculateAverage());
	System.out.println(boundedGenericClass2.calculateAverage());
	System.out.println(boundedGenericClass3.calculateAverage());
	
	System.out.println(boundedGenericClass1.isSameAverage(boundedGenericClass2));//Error
	
	System.out.println(boundedGenericClass1.isSameAverage(boundedGenericClass2));
	System.out.println(boundedGenericClass1.isSameAverage(boundedGenericClass3));
}
}
