package com.sang.thread.synchronization.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest1 {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new MyThread1());
		executorService.execute(new MyThread1());
		executorService.execute(new MyThread1());
		executorService.execute(new MyThread1());
		executorService.execute(new MyThread2());
		executorService.execute(new MyThread1());
		executorService.execute(new MyThread1());
		executorService.execute(new MyThread2());
		executorService.execute(new MyThread2());
		executorService.execute(new MyThread2());
		executorService.shutdown();
	}
}
