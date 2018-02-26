package com.sang.thread.synchronization.concurrency.blockingqueues;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	BlockingQueue<Integer> blockingQueue;
	
	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
		try {
			blockingQueue.put(i);
			System.out.println("Put the value into queue:"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

	
}
