package com.sang.thread.synchronization.concurrency.executor;

public class MyThread implements Runnable{
	private final long countUntil;

	MyThread(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName()+"-"+sum);
    }
}
