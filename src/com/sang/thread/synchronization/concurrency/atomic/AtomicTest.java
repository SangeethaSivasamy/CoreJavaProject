package com.sang.thread.synchronization.concurrency.atomic;

public class AtomicTest {

	public static void main(String[] args) {
		
		Message message = new Message();
		Message message2 = new Message();
		
		new MyThread1(message,message2);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new MyThread2(message);
	}
}
