package com.sang.statictest;

public class MyThread implements Runnable{

	@Override
	public void run() {
		MySingleton mySingleton = MySingleton.getMySingletonObject();
		System.out.println(mySingleton);
	}
	
}
