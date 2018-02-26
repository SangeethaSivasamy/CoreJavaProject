package com.sang.arrays.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysTest {

	public static void main(String[] args) {
		
		//String[] strarr = new String[10];
		String[] strarr = {"S","A","B","C","D"};
		
		List<String> arrlist = Arrays.asList(strarr);
		System.out.println(arrlist);
		//arrlist.add("E"); //You cannot add. It is fixed sized List
		
		
		System.out.println(Arrays.binarySearch(strarr, "B"));
		
		Arrays.sort(strarr);
		
		
		
		String[] copiedstrarr = Arrays.copyOf(strarr, 7);
		for(String s:copiedstrarr) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.equals(strarr, copiedstrarr));
		
		Arrays.fill(strarr, "Sangeetha");
		for(String s:strarr) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(copiedstrarr));
		
		Stream<String> stream = Arrays.stream(strarr);
	}
}
