package com.sang.designpattern.singleton;

public class Singleton {
//Lazy initialization
		/*private static Singleton singletonObj;
		private Singleton() {
			
		}
		public static Singleton getInstance() {
			if(singletonObj == null) {
				singletonObj = new Singleton();
			}
			return singletonObj;
		}*/
	
	//Thread safe
	/*private static Singleton singletonObj;
	private Singleton() {
		
	}
	public synchronized static Singleton getInstance() {
		if(singletonObj == null) {
			singletonObj = new Singleton();
		}
		return singletonObj;
	}*/
	
	//Eager initialization
	private static Singleton singletonObj = new Singleton();
	private Singleton() {
		System.out.println("constructor called");
	}
	public static Singleton getInstance() {
		return singletonObj;
	}
}
