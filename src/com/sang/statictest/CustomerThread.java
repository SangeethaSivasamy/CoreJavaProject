package com.sang.statictest;

public class CustomerThread implements Runnable{
	Customer customer;
	String message;
	public CustomerThread(Customer customer, String message) {
		this.customer = customer;
		this.message = message;
		new Thread(this).start();
	}
	
  public void run() {
	  System.out.println(Thread.currentThread().getName()+":"+customer.getStr());
	  customer.setStr(message); 
	  System.out.println(Thread.currentThread().getName()+":"+customer.getStr());
	  
  }
}
