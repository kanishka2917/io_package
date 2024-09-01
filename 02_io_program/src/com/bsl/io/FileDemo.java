package com.bsl.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		System.out.println("begin main");
		File f1 = new File("/Workspace/Java Workspace/io_package/02_io_program/src/hello.txt");
		System.out.println("the name of the file " + f1.getName());
		System.out.println("the absolute path of file " + f1.getAbsolutePath());
		System.out.println("the file is readable " + f1.canRead());
		System.out.println("the file is writable " + f1.canWrite());
		System.out.println("the file is present " + f1.exists());
		System.out.println("the length of file " + f1.length());
	}
}
