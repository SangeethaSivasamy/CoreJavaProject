package com.sang.thread.synchronization.concurrency.blockingqueues;


import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Integer> blockingQueue;
	
	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		while(true) {
		try {
			System.out.println(Thread.currentThread().getName()+blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

	
}

