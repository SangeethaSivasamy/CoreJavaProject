package com.sang.thread.synchronization.concurrency.executor;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId()+"Entered MyThread1");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
