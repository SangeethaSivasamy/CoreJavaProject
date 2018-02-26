package com.sang.thread.synchronization.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SynchronizationTest {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		
		MessageLogger logger = new MessageLogger();
		MessageLogger logger2 = new MessageLogger();
		new MyThread1(logger,semaphore);
		new MyThread2(logger2,semaphore);
	}
}
