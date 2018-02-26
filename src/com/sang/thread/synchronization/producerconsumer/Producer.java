package com.sang.thread.synchronization.producerconsumer;

public class Producer implements Runnable{

	MessageQueue messageQueue;
	
	public Producer(MessageQueue messageQueue) {
		this.messageQueue = messageQueue;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			messageQueue.addMessage(i+"");
		}
	}

}
