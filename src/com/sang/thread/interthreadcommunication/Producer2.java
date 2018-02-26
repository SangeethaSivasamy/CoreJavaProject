package com.sang.thread.interthreadcommunication;

public class Producer2 implements Runnable{
	DataHandler dataHandler;

	public Producer2(DataHandler dataHandler) {
		this.dataHandler = dataHandler;
	}
	@Override
	public void run() {
		int count = 0;
		//while(true)
		for(int i=0;i<10;i++) 
		{
			dataHandler.putMessage("Producer2"+count++);
		}

	}

}
