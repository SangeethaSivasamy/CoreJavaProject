package com.sang.thread.synchronization.concurrency.executor;

import java.util.concurrent.Callable;

public class FashionThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		System.out.println("Called");
		return "Executed Call";
	}

}
