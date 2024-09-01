package com.bsl.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("begin");
		FileInputStream fin = null;
		FileOutputStream fout = null;
		int i = 0;
		try {
			fin = new FileInputStream("/Workspace/Java Workspace/io_package/02_io_program/src/hello.txt");
			fout = new FileOutputStream("/Workspace/Java Workspace/io_package/02_io_program/src/bsl.txt");

			do {
				i = fin.read();
				if (i != -1) {
					fout.write(i);
				}
			} while (i != -1);

		} catch (FileNotFoundException e) {
			System.out.println("path of input or output file is incorrect");
		} catch (IOException e) {
			System.out.println("got an error while reading or writing");
		}

		finally {
			fin.close();
			fout.close();
		}

	}

}
