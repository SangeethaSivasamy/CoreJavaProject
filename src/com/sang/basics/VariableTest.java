package com.sang.basics;

import java.util.StringTokenizer;

public class VariableTest {

	int n;
	
	public static void main(String[] args) {
		
		String str = "Sangeetha  is a good girl";
		
		String[] strarr = str.split(" ");
		
		System.out.println(strarr.length);
		
		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
		System.out.println(stringTokenizer.countTokens());
		while(stringTokenizer.hasMoreTokens()){
			System.out.println("--"+stringTokenizer.nextToken());
		}
		
		
		
	}
}
