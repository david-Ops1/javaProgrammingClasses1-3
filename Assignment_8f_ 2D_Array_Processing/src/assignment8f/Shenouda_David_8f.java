package assignment8f;

public class Shenouda_David_8f {
	//David Shenouda CSIS 162-03 5/1/20
	public static void main(String[] args) {
		//Declaring 2D arrays
		double[][] array1 = {{1.0,2.0,3.0},{4.0,5.0,6.0}};
		double[][] array2 = {{1.0,2.0,3.0},{4.0,5.0,6.0}};
		double[][] array3 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
		double[][] array4 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
		
		//Caller for checking if to arrays are equal
		//Sends two arrays as parameters then accepts true or false
		boolean isEqual = arrayMath.isEqual2DArray(array1,array2);
		
		//Prints out if array1 and array2 are equal	
		System.out.println("Is array1 and array2 equal?" + isEqual + "\n");
		
		//Caller for adding two arrays Sends two arrays
		//Accepts the elements from the addition of both arrays into
		//The new 2D array C
		double[][] C =arrayMath.add2DArray(array1, array2);
		
		System.out.println("\narray1 and array2 matrix addition\n");
		//Loop to go through each row of array C
		for(int row = 0; row <C.length; ++row) {
			
			//Loop to go through each column of each row
			for(int col = 0; col < C[row].length; ++col) {
				
				//Prints out the elements of array C in table fashion
				System.out.print(C[row][col]+"\t");
			}
			System.out.println("\t");
		}
		
		//Caller for the matrix multiplication of two arrays Sends
		//Two arrays and accepts the multiplied elements of both
		//Arrays into new 2D array D
		double[][] D = arrayMath.mult2DArray(array3, array4);  
		
		System.out.println("\narray3 and array4 matrix multiplication\n");
		//Loop to go through each row of array D
		for(int row = 0; row <D.length; ++row) {
			
			//Loop to go through each column of each row
			for(int col = 0; col < D[row].length; ++col) {
				
				//Prints out the elements of array D in table fashion
				System.out.print(D[row][col]+"\t");
			}	
			System.out.println("\t");
		}
		System.out.println("\narray1 using the print2DArray method\n");
		//Caller to print an array sends one array
		arrayMath.print2DArray(array1);
		
	}
}
