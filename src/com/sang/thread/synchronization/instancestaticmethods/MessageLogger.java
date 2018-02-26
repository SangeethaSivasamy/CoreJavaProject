package com.sang.thread.synchronization.instancestaticmethods;

public class MessageLogger {

	public synchronized void print() {
		System.out.println(Thread.currentThread().getName()+": print()");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+": print() Exit");
	}
	
	public synchronized void printagain() {
		System.out.println(Thread.currentThread().getName()+": printagain()");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+": printagain() Exit");
	}
	
	public static synchronized void printstatic() {
		System.out.println(Thread.currentThread().getName()+": printstatic()");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+": printstatic() Exit");
	}
	
	public static synchronized void printstaticagain() {
		System.out.println(Thread.currentThread().getName()+": printstaticagain()");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+": printstaticagain() Exit");
	}
}
