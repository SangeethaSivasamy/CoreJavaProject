package com.sang.thread.synchronization;

public class TestSynchronization {
public static void main(String[] args) {
	//Perfectly working for synchronization
	/*MessageLogger messageLogger = new MessageLogger();
	MyThread mythread1 = new MyThread(messageLogger, "Hello");
	MyThread mythread2 = new MyThread(messageLogger, "Synchronized");
	MyThread mythread3 = new MyThread(messageLogger, "Test");
	
	Thread t1 = new Thread(mythread1,"MyThread1");
	t1.start();
	Thread t2 = new Thread(mythread2,"MyThread2");
	t2.start();
	Thread t3 = new Thread(mythread3,"MyThread3");
	t3.start();*/
	
	//Try on different objects
	/*MessageLogger messageLogger1 = new MessageLogger();
	MessageLogger messageLogger2 = new MessageLogger();
	MyThread mythread1 = new MyThread(messageLogger1, "Hello");
	MyThread mythread2 = new MyThread(messageLogger1, "Synchronized");
	MyThread mythread3 = new MyThread(messageLogger1, "Test");
	
	MyThread mythread4 = new MyThread(messageLogger2, "AAAAAAAA");
	MyThread mythread5 = new MyThread(messageLogger2, "BBBBBBBB");
	MyThread mythread6 = new MyThread(messageLogger2, "CCCCCCCC");
	
	Thread t1 = new Thread(mythread1,"MyThread1");
	t1.start();
	Thread t2 = new Thread(mythread2,"MyThread2");
	t2.start();
	Thread t3 = new Thread(mythread3,"MyThread3");
	t3.start();
	Thread t4 = new Thread(mythread4,"MyThread4");
	t4.start();
	Thread t5 = new Thread(mythread5,"MyThread5");
	t5.start();
	Thread t6 = new Thread(mythread6,"MyThread6");
	t6.start();*/
	
	//Try on different objects
	/*MessageLogger messageLogger1 = new MessageLogger();
	MyThread mythread1 = new MyThread(messageLogger1, "");
	for(int i=0;i<10;i++) {
		Thread t1 = new Thread(mythread1,""+i);
		t1.start();
	}
	
	MessageLogger messageLogger2 = new MessageLogger();
	MyThread mythread2 = new MyThread(messageLogger2, "");
	for(int i=0;i<10;i++) {
		Thread t2 = new Thread(mythread2,""+i+i);
		t2.start();
	}*/
	
	
	//Multiple synchronized methods
	/*MessageLogger messageLogger1 = new MessageLogger("1");
	MessageLogger messageLogger2 = new MessageLogger("2");
	MyThread mythread1 = new MyThread(messageLogger1, "");
	AdditionalThread mythread2 = new AdditionalThread(messageLogger1);
	Thread t1 = new Thread(mythread1,"Thread1");
	Thread t2 = new Thread(mythread2,"Thread2");
	t1.start();
	t2.start();*/
	
	//Object comparison
	
	
	
	MessageLogger messageLogger1 = new MessageLogger("1");
	MessageLogger messageLogger2 = new MessageLogger("1");
	
	
	MyThread mythread1 = new MyThread(messageLogger1, "");
	AdditionalThread mythread2 = new AdditionalThread(messageLogger2);
	Thread t1 = new Thread(mythread1,"Thread1");
	Thread t2 = new Thread(mythread2,"Thread2");
	t1.start();
	t2.start();
	
}
}
