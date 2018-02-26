package com.sang.thread.synchronization.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    
    
    private static final int NTHREDS = 3;
    public static void main(String[] args) {
    	ExecutorService executorService = Executors.newFixedThreadPool(NTHREDS);
    	for (int i = 0; i < 50; i++) {
    	    Runnable worker = new MyThread(10000000L + i);
    	    executorService.execute(worker);
    	}
    	// This will make the executor accept no new threads
    	// and finish all existing threads in the queue
    	executorService.shutdown();
    	System.out.println("Finished all threads");
	}



}
