package com.sang.statictest;

public class CustomerTest {
	
	public static void main(String[] args) {
		/*//Customer.str = "Sangeetha";
		
		
		Customer customer = new Customer();
		System.out.println(customer.getStr());
		customer.setStr("Sankar");
		
		//System.out.println(Customer.str);
		
		Customer customer2 = new Customer();
		System.out.println(customer2.getStr());
		//customer.setStr("Sankar");
*/		
		
		
		
		
		
		
		Customer customer = new Customer();
		CustomerThread customerThread = new CustomerThread(customer, "Sangeetha");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CustomerThread customerThread2 = new CustomerThread(customer, "Ajay");
	}
}
