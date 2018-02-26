package com.sang.thread.interthreadcommunication;

public class TestInterthread {
public static void main(String[] args) {
	DataHandler dataHandler = new DataHandler();
	
	Producer producer1 = new Producer(dataHandler);
	Thread producer1t = new Thread(producer1, "P1");
	
	Producer2 producer2 = new Producer2(dataHandler);
	Thread producer2t = new Thread(producer2, "P2");
	
	Consumer consumer1 = new Consumer(dataHandler);
	Thread consumer1t = new Thread(consumer1, "C1");
	
	producer1t.start();
	producer2t.start();
	consumer1t.start();
	
}
}
