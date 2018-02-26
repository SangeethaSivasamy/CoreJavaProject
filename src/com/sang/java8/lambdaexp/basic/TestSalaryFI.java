package com.sang.java8.lambdaexp.basic;

public class TestSalaryFI {
public static void main(String[] args) {
	ISalary iSalary;
	iSalary = n -> 100.0*n;
	double totalSalary = iSalary.calculateSalary(8);
	double totalSalary2 = iSalary.calculateSalary(10);
	System.out.println(totalSalary+"-"+totalSalary2);
	
	
	iSalary = n -> 2*22*n;
	double newSalary = iSalary.calculateSalary(20);
	System.out.println(newSalary);
}
}
