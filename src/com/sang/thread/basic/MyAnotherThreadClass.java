package com.sang.thread.basic;

public class MyAnotherThreadClass extends Thread{
public MyAnotherThreadClass(String threadName) {
	Thread.currentThread().setName(threadName);
	this.start();
}
	public void run() {
		try {
		System.out.println("Entered into run():"+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(500);
		}
		System.out.println("Exiting run():");
		}catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Entered main():"+Thread.currentThread().getName());
		Thread t = new MyAnotherThreadClass("SangeeAnotherThread");
		//t.start();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		System.out.println("Exiting main():");
	}
}
