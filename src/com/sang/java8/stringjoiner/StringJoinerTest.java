package com.sang.java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		
		StringJoiner sjoiner = new StringJoiner(",");
		sjoiner.add("Sangeetha");
		sjoiner.add("AAAA");
		sjoiner.add("BBBB");
		System.out.println(sjoiner);
		
		
		StringJoiner sjoiner2 = new StringJoiner(",","-",":");
		sjoiner2.add("A");
		sjoiner2.add("B");
		sjoiner2.add("C");
		System.out.println(sjoiner2);
		
	}
}
