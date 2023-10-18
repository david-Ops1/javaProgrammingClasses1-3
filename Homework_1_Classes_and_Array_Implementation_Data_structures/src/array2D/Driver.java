//Author:David Shenouda
//Date:2/10/21
//Class:CSIS 237-90 Data Structures
package array2D;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2D array1 = new Array2D(3,4);
		Array2D array2 = new Array2D();
		Array2D array3 = new Array2D(array1);
		System.out.println("\narray1 un-populated:");
		
		array1.print();
		
		System.out.println("\narray2 using the default constructor:");
		
		array2.print();
		
		System.out.println("\narray3 using the copy constructor to match array1:");
		array3.print();
		
		
		array1.setElement(0,0,1.0);
		array1.setElement(1,0,2.0);
		array1.setElement(2,0,3.0);
		
		array1.setElement(0,1,4.0);
		array1.setElement(1,1,5.0);
		array1.setElement(2,1,6.0);
		
		array1.setElement(0,2,7.0);
		array1.setElement(1,2,8.0);
		array1.setElement(2,2,9.0);
		
		array1.setElement(0,3,10.0);
		array1.setElement(1,3,11.0);
		array1.setElement(2,3,12.0);
		
		
		
		
		
		System.out.println("\narray1 using the alt constructor to 3 rows 4 columns, also"
				+ " initializing the elements in the array to 1.0-12.0:");
		array1.print();
		Array2D array4 = new Array2D(array1);
		System.out.println("\narray4 using the copy constructor to match array1:");
		array4.print();
		
		System.out.println("\nTesting getElement method on row 1 column 2 element in array1:" +
		array1.getElement(1, 2));
		
		System.out.println("\nTesting getElement method on row 1 column 2 element in array4:" +
		array4.getElement(1, 2));
		
		
		System.out.println("\narray4 number of rows: " + array4.getLength(0));
		
		System.out.println("\narray4 number of columns: " + array4.getLength(1));
		
		System.out.println("\narray4 typing 2 in to get an error: ");
		System.out.println(array4.getLength(2));
		
		
		array4.update(0.0);
		System.out.println("\narray 4 change all elements to 0.0 using the update method:");
		array4.print();
		
		
		System.out.println("\n\n\nTesting limits of method setElement on array1:");
		
		System.out.println("\nTesting limit x-coordinate 3:");
		array1.setElement(3,3,12.0);
		
		System.out.println("\nTesting limit x-coordinate -1:");
		array1.setElement(-1,3,12.0);
		
		System.out.println("\nTesting limit y-coordinate 4:");
		array1.setElement(2,4,12.0);
		
		System.out.println("\nTesting limit y-coordinate -1:");
		array1.setElement(2,-1,12.0);
		
		System.out.println("\nTesting limit y-coordinate -1 and x-coordinate -1:");
		array1.setElement(-1,-1,12.0);
		
		System.out.println("\nTesting limit y-coordinate 4 and x-coordinate 3:");
		array1.setElement(3,4,12.0);
		
		System.out.println("\nTesting limit y-coordinate 4 and x-coordinate -1:");
		array1.setElement(-1,4,12.0);
		
		System.out.println("\nTesting limit y-coordinate -1 and x-coordinate 3:");
		array1.setElement(3,-1,12.0);
		
		System.out.println("\n\nPrinting out array1 to the print method to see if any of the elements changed");
		array1.print();
		
		
		System.out.println("\n\n\nTesting limits of method getElement on array2:");
		System.out.println("\nTesting limit x-coordinate 2:");
		System.out.println(array2.getElement(2,0));
		
		System.out.println("\nTesting limit x-coordinate -1:");
		System.out.println(array2.getElement(-1,0));
		
		System.out.println("\nTesting limit y-coordinate 2:");
		System.out.println(array2.getElement(0,2));
		
		System.out.println("\nTesting limit y-coordinate -1:");
		System.out.println(array2.getElement(0,-1));
		
		System.out.println("\nTesting limit x-coordinate 2 and y-coordinate 2:");
		System.out.println(array2.getElement(2,2));
		
		System.out.println("\nTesting limit x-coordinate -1 and y-coordinate -1:");
		System.out.println(array2.getElement(-1,-1));
		
		System.out.println("\nTesting limit x-coordinate -1 and y-coordinate 2:");
		System.out.println(array2.getElement(-1,2));
		
		System.out.println("\nTesting limit x-coordinate 2 and y-coordinate -1:");
		System.out.println(array2.getElement(2,-1));
		
		
		
	}
}


