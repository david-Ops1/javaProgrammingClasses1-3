package assignment8f;

import java.util.Arrays;

public class arrayMath {
//David Shenouda CSIS 162-03 5/1/20
	
	//Method to check if the Arrays are equal (two Array parameters are passed in)
	public static boolean isEqual2DArray(double[][] A, double[][] B) {
		//Checks if the array A and B are both null
		if(A == null && B == null) {
			return true;
		}
		//Checks if either array is null if only one is null
		if (A == null || B == null) {
			return false;
		}
		//Checks to see if the rows in the arrays are not equal
		if (A.length != B.length) {
			System.out.println("Error!Array size mismatch!");
			return false;
		}
		//Loop to go through all indices of array A and B
		for (int idx = 0; idx < A.length; idx++) {
			//Method to check if each element in each array are the same
			//and in the same order
			if (!Arrays.equals(A[idx], B[idx])) {
				return false;
				
			}
		}
		return true;
	}
	//Method to add two arrays together Each element will be added to the element of the
	//exact same index as the other element
	public static double[][] add2DArray (double[][] A, double[][]B){
	//Declaring arrayC with the same amount of rows and columns as array A
	double[][] arrayC = new double[A.length][A[0].length];

	//Checks if the arrays do not have the same amount of rows
	if(A.length != B.length) {
		System.out.println("Error!Array size mismatch!");
		return arrayC;
	}
	//Checks if the arrays have the same amount of columns per row
	int firstLength = A[0].length;
	//Loop to check every row of array A
	for(int row = 0; row <A.length; ++row) {
		//Checks for jagged arrays by checking the number of columns in each array 
		//Is equal to firstLength which is the length array A row 0, which counts the number of columns 
		if (firstLength != B[row].length || firstLength != A[row].length) {
			System.out.println("Error!Array size mismatch!");
			return arrayC;
		}
	}
	//Our two arrays have the same dimensions, lets do the addition
		//Loop to go through each row
		for(int row = 0; row <A.length; ++row) {	
			//Loop to go through each column of each row
			for(int col = 0; col < A[row].length;++col) {
				arrayC[row][col] = A[row][col] + B[row][col];
				
			}
			
			}
		//returns arrayC which is the matrix addition of array A and array B
		return arrayC;
	}
	//Method to matrix multiply array A and array B
	public static double[][] mult2DArray(double[][] A, double[][] B){
		//Declaring and instantiating arrayD to the same size as array A.
		double[][] arrayD = new double[A.length][A[0].length];

		//Checks if array A and B have an unequal amount of rows
		if(A.length != B.length) {
			System.out.println("Error!Array size mismatch!");
			//Returns an empty array
			return arrayD;
		}
		//Check if they have the same amount of columns per row
		int firstLength = A[0].length;
		//Loop to go through every row of array A
		for(int row = 0; row <A.length; ++row) {
			//Checks to see if array A or B number of columns are not equal
			//To firstLength which the length of the first row in array A, which gives the number of columns
			if (firstLength != B[row].length || firstLength != A[row].length) {
				System.out.println("Error!Array size mismatch!");
				
				return arrayD;
			}
		}
		//Our two arrays have the same dimensions, lets do the matrix multiplication
			for(int row = 0; row <A.length; ++row) {	
				for(int col = 0; col < A[row].length;++col) {
					//Loop to go through each column of each row
					for(int rowM = 0; rowM <A.length;rowM++) {
						//Multiplies each row of A by a column of B so each new element
						//In arrayD Is the dot product of the elements in row A and column B.
					arrayD[row][col] += A[row][rowM] * B[rowM][col];
				}
			}

			
		}
			//Returns arrayD which is the matrix multiplication of array A and array B
			return arrayD;
	}
	public static void print2DArray(double[][] A){
		//Loop to go through every row of array A
		for(int row = 0; row <A.length; ++row) {
			//Loop to go through every column of each row
			for(int col = 0; col < A[row].length; ++col) {
				//Prints out array A elements in a table type fashion
				System.out.print(A[row][col]+"\t");
			}
			System.out.println("\t");
		}
	
	}
}
