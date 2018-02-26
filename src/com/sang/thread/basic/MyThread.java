package com.sang.thread.basic;

public class MyThread implements Runnable{

	@Override
	public void run() {
		try {
		System.out.println("Entered into run():"+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(500);
		}
		System.out.println("Exiting run():"+Thread.currentThread().getName());
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public static void main(String[] args) {
		System.out.println("Entered main():"+Thread.currentThread().getName());
		MyThread myThread = new MyThread();
		Thread t = new Thread(myThread, "SangeeThread1");
		t.start();
		
		MyThread myThread2 = new MyThread();
		Thread t2 = new Thread(myThread2, "SangeeThread2");
		t2.start();
		
		
		MyThread myThread3 = new MyThread();
		Thread t3 = new Thread(myThread3, "SangeeThread3");
		t3.start();
		try {
		t.join();
		t2.join();
		t3.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println(t.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		System.out.println("Exiting main():");
	}
}
