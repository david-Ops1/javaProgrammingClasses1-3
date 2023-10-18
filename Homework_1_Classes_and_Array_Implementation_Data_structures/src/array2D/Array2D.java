//Author:David Shenouda
//Date:2/10/21
//Class:CSIS 237-90 Data Structures
package array2D;

public class Array2D {
	//Declaring a 2D private array of type double
	private double[][] Array2D1;
	
	
	//Constructor that accepts two ints: a row and a column
	//
	public Array2D(int row, int col)
	{
		Array2D1 = new double [row][col];
		
	}
	
	//Default constructor: declares an new array 
	public Array2D()
	{
		
	Array2D1 = new double[2][2];

	}
	
	
	public Array2D(Array2D A)
	{
		Array2D1 = new double[A.getLength(0)][A.getLength(1)];
		
		for(int row = 0; row < A.getLength(0); row++ )
		{
			for(int col = 0; col < A.getLength(1); col++)
			{
				Array2D1[row][col] = A.getElement(row, col);
						
			}
		}
		
	}
	
	
	// Returns length of the specified dimension: 0 = row, 1 = column, other = error message
	public int getLength(int dim)  
		{
		if(dim == 0)
		{
			return Array2D1.length;
		}
		else if(dim == 1)
		{
			return Array2D1[0].length;
		}
		else if(dim !=1 && dim !=0)
		{
		System.out.println("\nError! Please choose int 0 for row length or 1 for"
				+ " column length of the array!");
			return 0;
		}
		return 0;
		}
	
	
	// Sets the element at position (x,y) to value E. If (x,y) is
	//out of bounds, an error message is printed and the array is not modified. Don't let the 
	//program crash!!!
	public void setElement(int x, int y, double E) 
	{
		//Checks if the x-coordinate is out of bounds
		//If it is out of bounds it sends an error message
		if (x >= Array2D1.length || x < 0)
		{
			System.out.println("\nError! x-coordinate for Element is out of bounds!");
			
		}
		
		//Checks if the y-coordinate is out of bounds
		//If it is out of bounds it sends an error message
		else if (y >= Array2D1[0].length || y < 0)
		{
			System.out.println("\nError! y-coordinate for the Element is out of bounds!");
			
		}
		//If both x and y coordinates are between the array parameters
		//then the array coordinate can be changed to element E
		else
		{
		Array2D1[x][y] = E;
		}
	}
 	
	
	// Returns the element at position (x,y) of the array.
	//If (x,y) is out of bounds, an error message is printed.
	//Don’t let the program crash!!!
	public double getElement(int x, int y)
	{
		//Checks if the x-coordinate is out of bounds
		//If it is out of bounds it sends an error message and returns 
		//0
		if (x >= Array2D1.length || x < 0)
		{
			System.out.println("\nError! x-coordinate for the Element is out of bounds!");
			return 0;
		}
		
		//Checks if the y-coordinate is out of bounds
		//If it is out of bounds it sends an error message and returns 
		//0
		if (y >= Array2D1[0].length || y < 0)
		{
			System.out.println("\nError! y-coordinate for the Element is out of bounds!");
			return 0;
		}
		double element = Array2D1[x][y];
		
		return element;
	}
	
	
	// Update all elements in the array so they are value E. 
	public void update(double E)
	{
		for(int row = 0; row <Array2D1.length; ++row) {
			//Loop to go through every column of each row
			for(int col = 0; col < Array2D1[row].length; ++col) {
				//Prints out array Array2D1 elements in a table type fashion
				Array2D1[row][col] = E;
			}
			
		}
	}
	
	
	// Print the array to console in grid format.
	//Use printf to format your output.
	public void print()
	{
		//Loop to go through every row of array Array2D1
				for(int row = 0; row <Array2D1.length; ++row) {
					//Loop to go through every column of each row
					for(int col = 0; col < Array2D1[row].length; ++col) {
						//Prints out array Array2D1 elements in a table type fashion
						System.out.printf("%s ", Array2D1[row][col] + "\t");
					}
					System.out.println("\t");
				}
	}
	
	
}
