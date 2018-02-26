package com.sang.thread.synchronization.producerconsumer;

public class Consumer implements Runnable{

	MessageQueue messageQueue;
	
	public Consumer(MessageQueue messageQueue) {
		this.messageQueue = messageQueue;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			messageQueue.getMessage();
		}
	}

}
