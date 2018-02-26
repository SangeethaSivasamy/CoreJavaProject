package com.sang.thread.synchronization;

public class AdditionalThread implements Runnable{

	MessageLogger msgloggerObj;

	public AdditionalThread(MessageLogger msgloggerObj) {
		this.msgloggerObj = msgloggerObj;
	}
	@Override
	public void run() {
		//msgloggerObj.add();
		msgloggerObj.display();
	}



}
