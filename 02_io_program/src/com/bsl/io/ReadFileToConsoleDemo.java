package com.bsl.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileToConsoleDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = null;
		try {
			fin = new FileInputStream("/Workspace/Java Workspace/io_package/02_io_program/src/hello.txt");
			int i = fin.read();
			System.out.println(i);
			
			char c = (char) i ; //typecasting
			System.out.println(c);
			
		} 
		catch (FileNotFoundException e) {

			System.out.println("the file or the path does not exists");
		} 
		catch (IOException e) {
			System.out.println("some issue with reading");
		}
		finally {
			fin.close();
		}

	}

}
                          