package com.sang.thread.synchronization.concurrency.stampedlock;

import java.util.HashMap;
import java.util.concurrent.locks.StampedLock;

public class MessageContainer {

	HashMap<Integer, String> hashMap = new HashMap<>();
	
	public void put(Integer key, String value,StampedLock stampedLock) {
		long stamp = stampedLock.readLock();
		try {
		System.out.println(Thread.currentThread().getName()+"-"+key+"-"+value);
		hashMap.put(key, value);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Exit");
		} finally {
			stampedLock.unlock(stamp);
		}
	}
	
	public void get(Integer key) {
		System.out.println(hashMap.get(key));
	}
}
