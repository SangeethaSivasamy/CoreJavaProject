package com.sang.thread.threadlocal;

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
		
		message.threadLocal.set("Sangeetha");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThread1:"+message.threadLocal.get());
		//System.out.println("MyThread1:"+message2.threadLocal.get());
	}

	
}
