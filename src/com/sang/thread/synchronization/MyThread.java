package com.sang.thread.synchronization;

public class MyThread implements Runnable{

	String stMessage;
	MessageLogger msgloggerObj;

	public MyThread(MessageLogger msgloggerObj, String stMessage) {
		this.stMessage = stMessage;
		this.msgloggerObj = msgloggerObj;
	}
	@Override
	public void run() {
		//msgloggerObj.printMessage(stMessage);
		//msgloggerObj.multiply();
		msgloggerObj.display();
	}

}
