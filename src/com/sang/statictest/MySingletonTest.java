package com.sang.statictest;

public class MySingletonTest {
	public static void main(String[] args) {
		try {
		MyThread myThread = new MyThread();
		MyThread myThread1 = new MyThread();
		
		Thread t = new Thread(myThread);
		t.start();
		Thread.sleep(1000);
		
		Thread t2 = new Thread(myThread1);
		t2.start();
		Thread.sleep(1000);
		
		Thread t3 = new Thread(myThread);
		t3.start();
		Thread.sleep(1000);
		
		
		Thread t4 = new Thread(myThread);
		t4.start();
		Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
