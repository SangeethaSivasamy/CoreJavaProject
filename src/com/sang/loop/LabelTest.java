package com.sang.loop;

public class LabelTest {
public static void main(String[] args) {
	label1:System.out.println("Sangeetha");
	label2:for(int i=0;i<10;i++) {
		System.out.println(i);
		if(i==5) {
			//continue label2;
			break label2;
		}
		System.out.println("Hello"+i);
	}
}
}
