package com.bsl.printstream;

import java.io.PrintStream;

public class PrintWriterDemoTwo {
	public static void main(String[] args) {
		
		PrintWriterDemoTwo writer = new PrintWriterDemoTwo();
		int i = 10;
		String s = "hello";
		double d = 10.99;
		PrintStream writer1 = null;
		writer1.println(i);
		writer1.println(s);
		writer1.println(d);
		
	}

}
