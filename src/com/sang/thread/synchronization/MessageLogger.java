package com.sang.thread.synchronization;

public class MessageLogger {
	
	public String name ;
	
	public MessageLogger (String name) {
		 this.name = name;
	}
	
public synchronized void printMessage(String stMessage) {
	System.out.println("----------printMessage-------------Entry:"+Thread.currentThread().getName());
	System.out.print("[");
	System.out.print(stMessage);
	System.out.print("]");
	System.out.println("");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("----------printMessage-------------Exit:"+Thread.currentThread().getName());
}

public synchronized void add() {
	System.out.println("----------add-------------Entry:"+Thread.currentThread().getName());
	int j = 3+4;
	System.out.println(Thread.currentThread().getName()+"----------add-----------"+j);
}


public void display() {
	
	synchronized (name) {
		System.out.println("----------display-------------:"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
		System.out.println("----------display-------------Exit:"+Thread.currentThread().getName());
	}
}

public void multiply() {
	synchronized (name) {
		System.out.println("----------multiply-------------:"+Thread.currentThread().getName());
		int k = 3*7;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(k);
		System.out.println("----------multiply-------------Exit:"+Thread.currentThread().getName());
		
	}
}

public boolean equals(MessageLogger messageLogger) {
	System.out.println("Inside equals");
	if((this.name).equals(messageLogger.name)) {
		return true;
	}
	else
		return false;
}
}
