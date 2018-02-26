package com.sang.generics.boundedtypes;

public class MyBoundedGenericClass<T> {

	T[] nums;
	
	public MyBoundedGenericClass(T[] nums) {
		this.nums=nums;
	}
	
	public double calculateAverage() {
		double average = 0.0;
		double sum = 0.0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i].doubleValue();//Error
		}
		return sum/nums.length;
	}
}
