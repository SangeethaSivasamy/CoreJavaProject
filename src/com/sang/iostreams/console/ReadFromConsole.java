package com.sang.iostreams.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromConsole {
public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//Read as character
	/*char c;
	try {
		while((c=(char)br.read())!=-1) {
			System.out.println(c);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	//Read as String
	/*String s;
	try {
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	
	//Write to Console
	System.out.println("Sangeetha is great");
	System.out.println("Sankar is a good boy");
	PrintWriter printWriter = new PrintWriter(System.out,true);
	printWriter.println("Sangeetha Sankar");
	
}
}
