package com.bsl.printstream;

import java.io.PrintWriter;

public class PrintWriterDemoTwo {
	public static void main(String[] args) {
		
		PrintWriter writer = new PrintWriter(System.out);
		int i = 10;
		String s = "hello";
		double d = 10.99;
		writer.println(i);
		writer.println(s);
		writer.println(d);
		
		
	}

}
