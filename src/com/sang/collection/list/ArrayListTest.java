package com.sang.collection.list;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
public static void main(String[] args) {
	List<String> fixedSizeList = Arrays.asList(new String[10]);
	fixedSizeList.add("Sangeetha");
	
	System.out.println(fixedSizeList);
}
}
