package com.sang.thread.synchronization.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class MyThread2 implements Runnable{

	MessageLogger logger;
	Semaphore semaphore;
	
	public MyThread2(MessageLogger logger,Semaphore semaphore) {
		this.semaphore = semaphore;
		this.logger = logger;
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		logger.print(semaphore);
		
	}

	
}
