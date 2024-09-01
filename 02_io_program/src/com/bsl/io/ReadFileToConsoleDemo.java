package com.bsl.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileToConsoleDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = null;
		try {
			fin = new FileInputStream("/Workspace/Java Workspace/io_package/02_io_program/src/hello.txt");
			int i = 0;
			do {
				i = fin.read();
				char c = (char) i;
				System.out.print(c);
			} while (i != -1);

		} catch (FileNotFoundException e) {
			System.out.println("cannot find the path or file");
		} finally {
			fin.close();
		}
	}

}
