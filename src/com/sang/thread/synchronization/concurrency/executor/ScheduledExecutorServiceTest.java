package com.sang.thread.synchronization.concurrency.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {

	public static void main(String[] args) {
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
		
		//ScheduledFuture<String> scheduledFuture = scheduledExecutorService.schedule(new FashionThread(), 5, TimeUnit.SECONDS);
		System.out.println("Calling");
		scheduledExecutorService.scheduleWithFixedDelay(new FashionThread2(), 1, 3,TimeUnit.SECONDS);
		//scheduledExecutorService.schedule(new FashionThread2(),1,TimeUnit.SECONDS);
		
		/*try {
			System.out.println("result = " + scheduledFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		//scheduledExecutorService.shutdown();
	}
}
