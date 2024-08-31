package com.bsl.printstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("please enter a value");
			String s1 = reader.readLine();
			int x = Integer.parseInt(s1);
			System.out.println("please enter a second vaue");
			String s2 = reader.readLine();
			int y = Integer.parseInt(s2);
			int z = x + y;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Some error reading");
			System.out.println("*******Program ends here*******");
		} catch (NumberFormatException e) {
			System.out.println("Please type only number");
			System.out.println("*******Program ends here*******");
		} finally {
			reader.close();
		}

	}

}
