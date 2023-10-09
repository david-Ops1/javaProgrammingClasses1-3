//David Shenouda
//2/26/21
//CSIS 237-90
package recursion;
import java.lang.Math;
import java.util.Scanner;
public class Problem1Power {

	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		
		int base = 0;
		int pow = 0;
		

		System.out.println("What is the base (only integers)?");
		base = console.nextInt();
		
		System.out.println("What is the exponent (only non-negative integers)?");
		pow = console.nextInt();
		
		
		System.out.println("Recursion on a base of " + base + " with a power of " + pow + " is: " + power(base,pow));
				
		
		
	}

public static long power (int base, int pow) 
{
	try {	
	
	long answer = 0;
	if(base == 0 &&  pow == 1)
	{
		return 0;
		
	}
	
	if(base == 0 && pow == 0)
	{
		throw new IllegalArgumentException();
		
	}
	
	if(pow == 0)
	{
		return 1;
	}
	
	if (pow < 0 )
	{
		throw new Exception();
	
	}
	
	
		
		 answer = (long)base * power(base, pow-1);
		 
		 return answer;
	}
	
	catch(IllegalArgumentException iae)
	{
		System.out.println("Error! Can't do 0 to the power of 0! ");
		return 0;
	}
	
	catch(Exception ex)
	{
		System.out.println("Error! Only non-negative integers are allowed for the exponent! ");
		return 0;
	}
	
	
}

}


