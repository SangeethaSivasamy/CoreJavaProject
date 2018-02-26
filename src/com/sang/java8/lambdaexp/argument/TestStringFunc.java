package com.sang.java8.lambdaexp.argument;

public class TestStringFunc {

public static String callfunc(IStringFunc iStringFunc, String s) {
	return iStringFunc.func(s);
	
}
	
public static void main(String[] args) {
	IStringFunc iStringFunc;
	iStringFunc = n -> {
		String result = "";
		int i;
		for(i = 0; i < n.length(); i++)
		if(n.charAt(i) != ' ')
		result += n.charAt(i);
		return result;
	};
	String output = callfunc(iStringFunc, "This is input");
	System.out.println(output);
}
}
