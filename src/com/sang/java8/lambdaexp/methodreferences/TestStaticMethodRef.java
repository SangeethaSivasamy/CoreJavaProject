package com.sang.java8.lambdaexp.methodreferences;

public class TestStaticMethodRef {



	public static void main(String[] args) {
		TestStaticMethodRef methodRef = new TestStaticMethodRef();
		methodRef.callOperation();
	}

	public void callOperation() {
		INumFunc iNumFunc;
		//iNumFunc = (a,b) -> a+b;

		iNumFunc = Operation::addstatic;//static method reference
		System.out.println(iNumFunc.addNum(3, 4));
		
		Operation operation = new Operation();
		iNumFunc = operation::addinstance;//instance method reference
		System.out.println(iNumFunc.addNum(10, 40));
		

		
		ICustomerFactory customerFactory;
		customerFactory = Customer::new;//constructor reference
		System.out.println(customerFactory.getCustomer("Sangeetha", "34"));
		
	}
}
