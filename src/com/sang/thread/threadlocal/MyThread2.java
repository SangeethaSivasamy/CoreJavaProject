package com.sang.thread.threadlocal;

public class MyThread2 implements Runnable{

	Message message;
	public MyThread2(Message message) {
		this.message = message;
		new Thread(this).start();
	}
	@Override
	public void run() {
		
		//message.threadLocal.set("Ajay");
		
		System.out.println("MyThread2:"+message.threadLocal.get());
	}

	
}
