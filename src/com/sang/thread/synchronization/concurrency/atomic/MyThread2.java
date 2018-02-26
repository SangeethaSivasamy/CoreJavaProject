package com.sang.thread.synchronization.concurrency.atomic;

public class MyThread2 implements Runnable{

	Message message;
	public MyThread2(Message message) {
		this.message = message;
		new Thread(this).start();
	}
	@Override
	public void run() {
		
		//message.atomicInteger.set(2);
		
		System.out.println("MyThread2:"+message.atomicInteger.get());
	}

	
}
