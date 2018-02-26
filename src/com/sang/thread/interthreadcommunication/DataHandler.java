package com.sang.thread.interthreadcommunication;

public class DataHandler {

	String message;
	boolean valueSet = false;
	
	public synchronized void putMessage(String message) {
		System.out.println("Entry:"+Thread.currentThread().getName());
		if(valueSet) {
			try {
				this.wait();
				System.out.println("Threadstate:"+Thread.currentThread().getState()+"-"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Threadstate:"+Thread.currentThread().getState()+"-"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+"---->putting value:"+message);
		this.message=message;
		valueSet=true;
		this.notify();
		System.out.println("Exit:"+Thread.currentThread().getName());
	}
	
	public synchronized void getMessage() {
		if(!valueSet) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("getting value:"+message);
		valueSet=false;
		this.notify();
	}
}
