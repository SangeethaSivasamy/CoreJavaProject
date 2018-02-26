package com.sang.string.stringjoin;

import java.util.StringJoiner;

public class StringJoinTest {
public static void main(String[] args) {
	String s = String.join(",", "Sangeetha","Sankar","AAAA","BBBB","Amar");
	System.out.println(s);
	
	StringJoiner stringJoiner = new StringJoiner(",");
	stringJoiner.add("A");
	stringJoiner.add("B");
	stringJoiner.add("C");
	stringJoiner.add("D");
	System.out.println(stringJoiner);
	
	
	StringJoiner stringJoiner1 = new StringJoiner(",","-","/");
	stringJoiner1.add("A");
	stringJoiner1.add("B");
	stringJoiner1.add("C");
	stringJoiner1.add("D");
	System.out.println(stringJoiner1);
}
}
