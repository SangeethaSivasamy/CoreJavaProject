package com.sang.statictest;

public class MySingleton {

		private static MySingleton mySingleton;
		
		private MySingleton() {
			
		}
		
		public static MySingleton getMySingletonObject() {
			if(mySingleton == null) {
				mySingleton = new MySingleton();
			}
			return mySingleton;
		}
}
