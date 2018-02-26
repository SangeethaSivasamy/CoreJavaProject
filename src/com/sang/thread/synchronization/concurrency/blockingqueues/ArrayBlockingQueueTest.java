package com.sang.thread.synchronization.concurrency.blockingqueues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);
		
		new Producer(blockingQueue);
		new Consumer(blockingQueue);
	}
}
