package com.sang.generics.boundedtypes;

public class MyBoundedGenericClass1<T extends Number> {

	T[] nums;
	
	public MyBoundedGenericClass1(T[] nums) {
		this.nums=nums;
	}
	
	public double calculateAverage() {
		double average = 0.0;
		double sum = 0.0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i].doubleValue();
		}
		return sum/nums.length;
	}
}
