package oop_java;

public class Array_2D {

	public static void main(String[] args) {
		// Define the number of rows and columns
        int m = 2, n = 2;
 
        // Define the elements of the matrices directly
        int[][] first = {
            {1, 2},
            {3, 4}
        };
        int[][] second = {
            {5, 6},
            {7, 8}
        };
 
        // Initialize the sum matrix
        int[][] sum = new int[2][2];
 
        // Calculate the sum of the two matrices
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                sum[c][d] = first[c][d] + second[c][d];  // Replace '+' with '-' to subtract matrices if needed
            }
        }
 
        // Display the resulting sum matrix
        System.out.println("Sum of the matrices:");
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }

}
