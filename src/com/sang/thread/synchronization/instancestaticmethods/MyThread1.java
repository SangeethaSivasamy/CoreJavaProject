package com.sang.thread.synchronization.instancestaticmethods;

public class MyThread1 implements Runnable{

	MessageLogger logger;
	
	public MyThread1(MessageLogger logger) {
		this.logger = logger;
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		logger.printstatic();
		
	}

	
}
