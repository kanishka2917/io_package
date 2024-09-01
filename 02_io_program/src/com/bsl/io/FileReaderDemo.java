package com.bsl.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("begin");
		FileReader reader = null;
		int i = 0;
		try {
			reader = new FileReader("/Workspace/Java Workspace/io_package/02_io_program/src/hello.txt");
			do {
				i = reader.read();
				System.out.print((char) i);
			} 
			while (i != -1);
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("file not found exception");
		} 
		
		catch (IOException e) {
			System.out.println("io exception");
		} 
		
		finally {
			reader.close();
		}
		
		System.out.println("\n end main");

	}

}
