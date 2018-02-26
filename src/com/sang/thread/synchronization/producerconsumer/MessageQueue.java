package com.sang.thread.synchronization.producerconsumer;

import java.util.LinkedList;

public class MessageQueue {

	LinkedList<String> linkedList = new LinkedList<>();
	
	public synchronized void addMessage(String message) {
		if(!linkedList.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Adding "+message);
		linkedList.addLast(message);
		this.notify();
	}
	
	
	public synchronized String getMessage() {
		if(linkedList.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String message =  linkedList.poll();
		System.out.println("Got "+message);
		this.notify();
		return message;
	}
}
