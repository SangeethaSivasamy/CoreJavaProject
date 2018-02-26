package com.sang.thread.interthreadcommunication;


public class Consumer implements Runnable{
	DataHandler dataHandler;

	public Consumer(DataHandler dataHandler) {
		this.dataHandler = dataHandler;
	}
	
	
	@Override
	public void run() {
		while(true) {
			dataHandler.getMessage();
		}

	}

}
