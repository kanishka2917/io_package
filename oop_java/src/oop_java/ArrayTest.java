package oop_java;

public class ArrayTest {
	public static void main (String args[]) {
		int number [] = {48,39,81,3818,38};
		int n = number.length;
		System.out.println("given list");
		for (int i = 0; i < n; i++)
		{
			System.out.println(" " + number[i]);
		}
		System.out.println("\n");
		for(int i = 0; i < n; i ++) {
			for(int j = i + 1; j < n; j++) {
				if(number[i]<number[j]) {
					int temp = number[i];
					number [i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("sorted list");
		for (int i = 0; i < n; i++)
		{
			System.out.println(" " + number[i]);
		}
	}

}
