package com.sang.thread.synchronization.producerconsumer;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		MessageQueue messageQueue = new MessageQueue();
		
		new Producer(messageQueue);
		new Consumer(messageQueue);
	}
	
	
	 
}
