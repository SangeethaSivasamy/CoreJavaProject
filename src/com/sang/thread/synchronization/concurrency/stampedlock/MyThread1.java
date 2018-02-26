package com.sang.thread.synchronization.concurrency.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class MyThread1 implements Runnable{
	MessageContainer messageContainer;
	StampedLock stampedLock;
	public MyThread1(MessageContainer messageContainer,StampedLock stampedLock) {
		this.messageContainer = messageContainer;
		this.stampedLock = stampedLock;
		new Thread(this).start();
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		messageContainer.put(i,i+"",stampedLock);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	
}
