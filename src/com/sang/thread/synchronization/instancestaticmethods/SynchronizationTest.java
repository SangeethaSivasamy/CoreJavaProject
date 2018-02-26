package com.sang.thread.synchronization.instancestaticmethods;

public class SynchronizationTest {

	public static void main(String[] args) {
		
		MessageLogger logger = new MessageLogger();
		MessageLogger logger2 = new MessageLogger();
		new MyThread1(logger);
		new MyThread2(logger2);
	}
}
