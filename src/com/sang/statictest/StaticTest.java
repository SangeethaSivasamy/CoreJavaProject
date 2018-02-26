package com.sang.statictest;

public class StaticTest {
	int i;
	static int j;
public static void main(String[] args) {
	System.out.println("Main method");
}

static {
	j=20;
	System.out.println("static block"+j);
	
}
}
