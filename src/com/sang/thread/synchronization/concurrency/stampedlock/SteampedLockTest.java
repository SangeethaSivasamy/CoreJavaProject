package com.sang.thread.synchronization.concurrency.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class SteampedLockTest {

	public static void main(String[] args) {
		
		StampedLock stampedLock = new StampedLock();
		MessageContainer messageContainer = new MessageContainer();
		
		new MyThread1(messageContainer,stampedLock);
		new MyThread2(messageContainer,stampedLock);
	}
}
