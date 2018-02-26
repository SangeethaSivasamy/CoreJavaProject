package com.sang.thread.synchronization.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class MyThread1 implements Runnable{

	MessageLogger logger;
	Semaphore semaphore;
	
	public MyThread1(MessageLogger logger,Semaphore semaphore) {
		this.logger = logger;
		this.semaphore=semaphore;
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		logger.print(semaphore);
		
	}

	
}
