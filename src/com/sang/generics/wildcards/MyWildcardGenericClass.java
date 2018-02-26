package com.sang.generics.wildcards;

public class MyWildcardGenericClass<T extends Number> {

	T[] nums;
	
	public MyWildcardGenericClass(T[] nums) {
		this.nums=nums;
	}
	
	public double calculateAverage() {
		double sum = 0.0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	//Incorrect
	public boolean isSameAverage(MyWildcardGenericClass<T> obj) {
		if(this.calculateAverage() == obj.calculateAverage())
			return true;
		else 
			return false;
	}
	
	public boolean isSameAverage1(MyWildcardGenericClass<? extends Number> obj) {
		if(this.calculateAverage() == obj.calculateAverage())
			return true;
		else 
			return false;
	}
}
