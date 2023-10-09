//David Shenouda
//2/26/21
//CSIS 237-90
package recursion;

public class Problem2PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		printPattern(num);
	}

	
	
	


public static void printPattern(int num) 
{
	char amp = '&';
	char star = '*';
	
	if (num <= 0)
	{
		return;
	}
	if(num > 0)
	{
		
		
		for(int idx = 0; idx < num; idx++ )
		{
			System.out.print("" + amp);
			
		}
		System.out.println();
		
	
	
		if(num > 1)
		{
		printPattern(num-1);
		}
	
		for(int idx = 0; idx < num; idx++ )
		{
			System.out.print("" + star );
		
		}
		System.out.println();
		
	}
	
}
}
	




