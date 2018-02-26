package com.sang.thread.synchronization.instancestaticmethods;

public class MyThread2 implements Runnable{

	MessageLogger logger;
	
	public MyThread2(MessageLogger logger) {
		this.logger = logger;
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		logger.printstaticagain();
		
	}

	
}
