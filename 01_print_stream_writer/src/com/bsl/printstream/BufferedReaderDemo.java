package com.bsl.printstream;

import java.io.IOException;

import javax.print.DocFlavor.READER;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		System.out.println("please enter a value");
		Object reader = null;
		String s1 = (String) reader;
		int x = Integer.parseInt(s1);
		System.out.println("please enter a second vaue");
		String reader2 = null;
		String s2 = (String) reader2 ;
		int y = Integer.parseInt(s2);
		int z = x + y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
			
	}

}
