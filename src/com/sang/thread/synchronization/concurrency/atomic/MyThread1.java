package com.sang.thread.synchronization.concurrency.atomic;

public class MyThread1 implements Runnable{

	Message message;
	Message message2;
	public MyThread1(Message message,Message message2) {
		this.message = message;
		this.message2 = message2;
		new Thread(this).start();
	}
	@Override
	public void run() {
		
		message.atomicInteger.set(1);
		message2.atomicInteger.set(12);
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThread1 message:"+message.atomicInteger.get());
		System.out.println("MyThread1 message2:"+message2.atomicInteger.get());
	}

	
}
