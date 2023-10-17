package finalproject2;
//David Shenouda
//5/6/21
//CSIS 237-90
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class VehicleInventory {
	Scanner console = new Scanner(System.in);
	
	
	
	//Method to add a Vehicle. Returns an object of type Vehicle to the driver. Accepts nothing.
	public  Vehicle addVehicle() throws Exception {
		//Getting user input for the VIN
		System.out.println("What is the VIN?");
		String VIN = console.next();
		String Type = "";
		
		//Using a false flag while loop to only accept car, truck, or SUV.
		boolean flag = false;
		//While loop stops once the user types in the one of the three Vehicles
		while(!flag)
		{
		System.out.println("What is the Type?(Only 3 types car, truck, or SUV)");
		Type = console.next();
		if(Type.equals("car") || Type.equals("truck") || Type.equals("SUV"))
		{
			//Sets flag to true if the user typed in one of the three Vehicles
			flag = true;
		}
		}
		//Getting the rest of the user input for the new object Vehicle
		System.out.println("What is the MSRP?");
		double MSRP = console.nextDouble();
		System.out.println("What is the Make?");
		String Make = console.next();
		System.out.println("What is the Model?");
		String Model = console.next();
		System.out.println("What is the Model year?");
		int ModelYear = console.nextInt();
		
		//Declaring the new Vehicle with all the variables the user specified
		Vehicle x = new Vehicle(VIN,Type,MSRP,Make,Model,ModelYear);
		
		System.out.println("Successfully added Vehicle to linked list!");
		
		//Returns an object of type Vehicle
		return x;
	}//End of addVehicle method
	
	
	//Method to remove a Vehicle from the linked list. Accepts an int and a linked list of type Vehicle.
	//Sends back nothing.
	public void removeByIndex(int idx,LinkedList<Vehicle> x) throws Exception {
		
		//Checks if the user sent an index that is out range for the linked list
		if (idx >= x.size() || idx < 0 )
		{
			throw new Exception("Index is out of range for Vehicle Inventory!");
		}
		//If the index is range then the element is removed from the linked list
		System.out.println("Deleting element at index: " + idx);
		x.remove(idx);
	}//End of removeByIndex method
	
	
	//Method to remove a Vehicle by VIN from the linked list. Accepts a string and a linked list of type Vehicle.
	//Sends back nothing.
	public void removeByVIN(String VIN, LinkedList<Vehicle> x) throws Exception {
		
		//For loop to iterate through each element in the linked list
		for(int i = 0; i < x.size(); ++i)
		{
			//Declaring a temp object of type Vehicle to store each element in the linked list
			Vehicle temp = x.get(i);
			
			//if the user specified VIN equals the VIN in the linked list then that Vehicle is removed
			if(VIN.equals(temp.getVIN()))
					{
			
						System.out.println("" + i + ":\t" + x.get(i));
						System.out.println("Vehicle that will be removed...");
						x.remove(i);
					}
			
		}//End of for
		
		
	}//End of removeByVIN method
	
	
	//Method to find a Vehicle with the  user specified VIN in a linked list of type Vehicle. Accepts
	//a string and a Linked List of type Vehicle.
	public int findByVIN(String VIN, LinkedList<Vehicle> x) throws Exception {
		
		//For loop to iterate through each element in the linked list
		for(int i = 0; i < x.size(); ++i)
		{
			Vehicle temp = x.get(i);
			
			//Checks if the VIN is the same as the VIN in the specific Vehicle in the linked list
			if(VIN.equals(temp.getVIN()))
					{
						//Sends the VIN to console with a message about the VIN
						System.out.println("This the Index of the Vehicle with VIN: " + VIN);
						
						//Returns the index of the Vehicle with the VIN to the driver
						return i;
					}
			
			
			
		}//End of for loop
		
		//If the VIN isn't found
		System.out.println("The VIN number doesn't match any Vehicles in the inventory!");
		
		//Return a non-index int back to the driver
		return -1;
	}//End of findByVIN method
	
	
	//Method that finds a Vehicles based on their type (car, truck, or SUV). Accepts a string and
	//a linked list of type Vehicle. Sends back an array of ints.
	public int [] findByType(String Type, LinkedList<Vehicle> x)
	{
		//counts the number elements of the specified user Type
		int counter = 0;
		
		//For loop to index through the linked list
		for(int i = 0; i < x.size(); ++i)
		{
			//Storing an element of type Vehicle into temp Vehicle type
			Vehicle temp = x.get(i);
			
			//Checks if temp is equal to the user specified Type
			if(Type.equals(temp.getType()))
			{
				//Increments the number of a one type of Vehicle (car, truck, or SUV)
				counter++;
			
			}
			
		}//End of for loop
		
		//Initalizing a int array with the amount of space for one type of Vehicle (car, truck, or SUV)
		int [] VehType = new int[counter];
		
		//Resetting counter
		counter = 0;
		
		//For loop to store the locations of each linked list location with the user specified Type
		//into the int array of VehType
		for(int i = 0; i < x.size(); ++i)
		{
			Vehicle temp = x.get(i);
			if(Type.equals(temp.getType()))
			{
					
					VehType[counter] = i;
					counter++;
			}
			
		}//End of for loop
		
		//Returns the int array containing the index locations of the specific linked list location that contain
		//the user specified Vehicle Type.
		return VehType;
	}//End of findByType method
	
	
	//Method to find the cheapest Vehicle in the linked list of type Vehicle. Accepts a linked list
	//of type Vehicle. Returns an index position the identifies the cheapest Vehicle in the linked list
	public int findCheapest (LinkedList<Vehicle> x)
	{
		//Declaring object of type Vehicle that will hold the min and current Vehicles in the linked list
		Vehicle min;
		
		Vehicle curr;
		
		//Represents the current minimum index in the linked list
		int minMSRPind = -1;
		//Counter
		int count = 0;
		
		
		//Iterator of type Vehicle that will index through the linked list
		Iterator<Vehicle> it = x.iterator();
		
		//Checks if the count is less then the amount of elements in the linked list
		if(count < x.size())
		{
			//Sets the element in the linked list to Vehicle object min
			min = x.get(count);
			//The index of that element is then set to the current minMSRPind
			minMSRPind = count;
			//Escape clause
			count++;
			
			//While loop that iterates through the linked list as long as their are elements in the list
			while(it.hasNext()) 
			{
				//Sets the next element to the Vehicle object current 
				curr = it.next();
				
				//Checks if the MSRP of Current is cheaper then that of Vehicle object min
				if(curr.getMSRP() < min.getMSRP())
				{
					//If curr is cheaper then minMSRPind gets the index of Vehicle object curr
					minMSRPind = count;
					//The current Vehicle object then becomes the minimum Vehicle object
					min = curr;
				}
				//Escape
				count++;
			}//End of while
			
		}//End of if
		
		//If the count is larger then the size of the linked list
		else
		{
			minMSRPind = -1;
		}
		
		//Return the index of the cheapest Vehicle object
		return minMSRPind;
		
	}//End of findCheapest method
	
	
	//Method that finds the cheapest user specified Vehicle type in the linked list. Accepts
	//a string and a linked list of type Vehicle. Returns an int.
	public int findTypeCheapest (String Type, LinkedList<Vehicle> x)
	{	
		//Declaring object of type Vehicle that will hold the cheapest and current Vehicles in the linked list
		Vehicle cheapest;
		
		Vehicle curr;
		
		//Represents the current minimum index in the linked list
		int minMSRPind = -1;
		//Counter
		int count = 0;
		
		//Iterator of type Vehicle that will index through the linked list
		Iterator<Vehicle> it = x.iterator();
		
		//False flag to control a while loop later on
		boolean flag = false;
		for(int i = 0; i < x.size(); ++i)
		{
				//Checks if the linked list even has the specified user Type
			  if(it.next().getType().equals(Type))
			  {
				  //If the specified user Type is found in the linked list then the flag is set to true
				  flag = true;
			  }
		
		}//End of for loop
		
		//Iterator of type Vehicle that will index through the linked list.(second one to restart the iteration cycle).
		Iterator<Vehicle> it2 = x.iterator();
		
		//Run if the flag is true (means that the type of Vehicle exist in this linked list)
		if(flag)
		{
		
		//While loop to increment the other Types of Vehicles in the linked list.
		while(!it2.next().getType().equals(Type) && it2.hasNext())
		{
			count++;
		}
		
		//Checks if the count of the linked list is smaller then that of the linked list size
		if(count < x.size())
		{
			cheapest = x.get(count);
			minMSRPind = count;
			count++;
			
			//Another while loop to iterate through 
			while(it2.hasNext()) 
			{
				curr = it2.next();
				
				//Checks if the curr element is cheaper then the cheapest element in the linked list
				//Also checks if the type is of the specific user defined Vehicle type
				if(curr.getMSRP() < cheapest.getMSRP() && curr.getType().equals(Type))
				{
					minMSRPind = count;
					cheapest = curr;
				}
				//Escape
				count++;
			}//End of while
			
		}//End of if
		
		//If the counter is larger then the size of the linked list
		else
		{
			minMSRPind = -1;
		}
		
		}
		
		//Return the int with the cheapest Vehicle element index in the linked list
		return minMSRPind;
		
	}//End of findTypeCheapest method
	
	
	//Method that finds the Vehicles that are in the range of the user specified MSRP's. Accepts
	//a two doubles (lower bound and upper bound MSRPs) and a linked list of type Vehicle. Returns
	//an array of type int with the indexes of the Vehicle objects that are within range of the users price.
	public int [] findRangeMSRP(double LB, double UB, LinkedList<Vehicle> x)
	{
		
		int counter = 0;
		//For loop to iterate through the linked list
		for(int i = 0; i < x.size(); ++i)
		{
			//Object of type Vehicle to hold the Vehicle object in the linked list temporarily
			Vehicle temp = x.get(i);
			
			//Checks if the object is in the price range
			if(LB <=temp.getMSRP() && UB >= temp.getMSRP())
			{
				//Increments the counter if it is
				counter++;
				
			}
			
		}//End of for
		
		
		//Initializing a new array of type int to the amount of actual elements within the price range of
		//the user.
		int [] inRange = new int[counter];
		//Resetting the counter
		counter = 0;
		
		//for loop to iterate through the linked list again
		for(int i = 0; i < x.size(); ++i)
		{
			Vehicle temp = x.get(i);
			
			//Checks if the object is in the price range
			if(LB <=temp.getMSRP() && UB >= temp.getMSRP())
			{
					//Placing the index of the element in the linked list to the space in the array
					inRange[counter] = i;
					//Counts the amount of elements within the user price range
					counter++;
			}
			
		}//End of for loop
		
		//Returns the array of ints
		return inRange;
	}//End of findRangeMSRP
	
	
	//Method that finds the Vehicles that are in the range of the user specified MSRP's and Type. Accepts
	//a two doubles (lower bound and upper bound MSRPs), a linked list of type Vehicle and a string for the type
	//of Vehicle that the user wants. Returns an array of type int with the indexes of the Vehicle objects
	//that are within range of the users price and type.
	public int [] findTypeRangeMSRP(double LB, double UB, String Type, LinkedList<Vehicle> x)
	{
		int counter = 0;
		
		//For loop to iterate through the linked list
		for(int i = 0; i < x.size(); ++i)
		{
			Vehicle temp = x.get(i);
			//Checks if the object is in the price range and is the correct type.
			if(LB <=temp.getMSRP() && UB >= temp.getMSRP() && Type.equals(temp.getType()))
			{
				//Increments the counter if it is
				counter++;
				
			}
			
		}//End of for loop
		
		
		//Initializing a new array of type int to the amount of actual elements within the price range and that
		//are of the correct type for the user.
		int [] inRange = new int[counter];
		
		//Resetting the counter
		counter = 0;
		
		//For loop to iterate through the linked list
		for(int i = 0; i < x.size(); ++i)
		{
			Vehicle temp = x.get(i);
			//Checks if the object is in the price range and is the correct type.
			if(LB <=temp.getMSRP() && UB >= temp.getMSRP() && Type.equals(temp.getType()))
			{
					//Placing the index of the element in the linked list to the space in the array
					inRange[counter] = i;
					//Counts the amount of elements within the user price range and are the right type
					counter++;
					
			}
			
		}//End of for loop
		
		//Returns the array of ints
		return inRange;
	}//End of findTypeRangeMSRP
	
	
	//Method that updates the object type Vehicle in a linked list of Vehicles. Accepts an int with
	//the index of the Vehicle needed to be updated and a linked list of type Vehicle.
	//Returns nothing.
	public void updateVehicle(int idx, LinkedList<Vehicle> x)
	{
			//Declaring an object of type Vehicle that will hold the object in the linked list
			Vehicle temp = x.get(idx);
			
			//Prints out the object
			System.out.println("" + idx + ":" + x.get(idx).toString());
			
			//Collecting user input to update the object with (same as addVehicle method)
			System.out.println("What is the VIN?");
			String VIN = console.next();
			
			//Sets the temp Vehicle to VIN to the user specified VIN
			temp.setVIN(VIN);
			
			String Type = "";
			
			//False flag to control the while loop
			boolean flag = false;
			
			//False flag controlled while loop to get only car truck or SUV input from the user
			while(!flag)
			{
			System.out.println("What is the Type?(Only 3 types car, truck, or SUV)");
			Type = console.next();
			
			if(Type.equals("car") || Type.equals("truck") || Type.equals("SUV"))
			{
				//Escape
				flag = true;
			}
			}//End of the while loop
			
			//Setting temp to a new Type
			temp.setType(Type);
			System.out.println("What is the MSRP?");
			double MSRP = console.nextDouble();
			
			//Setting temp to a new MSRP
			temp.setMSRP(MSRP);
			
			System.out.println("What is the Make?");
			String Make = console.next();
			
			//Setting temp to a new Make
			temp.setMake(Make);
			
			System.out.println("What is the Model?");
			String Model = console.next();
			
			//Setting temp to a new Model
			temp.setModel(Model);
			
			System.out.println("What is the Model year?");
			int ModelYear = console.nextInt();
			
			//Setting temp to a new ModelYear
			temp.setModelYear(ModelYear);
		
	}//End of updateVehicle method
	
	
	//Method that prints all the elements in the linked list. Accepts an int for
	//the size of the linked list and a linked list of type Vehicle.Returns nothing.
	public void printAllInventory(int size, LinkedList<Vehicle> x) 
	{
		System.out.println("Printing out the Vehicle linked list...");
		//Prints out the linked list
		for(int i = 0; i < size; ++i)
		{
			System.out.println("" + i + ":\t" + x.get(i));
			
		}//End of for loop
		
	}//End of printAllInventory method
	
	
	//Method that prints all the inventory in the linked list based of type of Vehicle.Accepts an int for
	//the size of the linked list and a linked list of type Vehicle.Returns nothing.
	public void printTypeInventory(int size, LinkedList<Vehicle> x)
	{
		System.out.println("Printing out the Vehicle linked list...");
		//Prints out the linked list for cars
		for(int i = 0; i < size; ++i)
		{
			Vehicle temp = x.get(i);
			if("car".equals(temp.getType()))
			System.out.println("" + i + ":\t" + x.get(i));
			
		}//End of for loop
		
		//Prints out the linked list for trucks
		for(int i = 0; i < size; ++i)
		{
			Vehicle temp = x.get(i);
			if("truck".equals(temp.getType()))
			System.out.println("" + i + ":\t" + x.get(i));
			
		}//End of for loop
		
		//Prints out the linked list for SUVs
		for(int i = 0; i < size; ++i)
		{
			Vehicle temp = x.get(i);
			if("SUV".equals(temp.getType()))
			System.out.println("" + i + ":\t" + x.get(i));
			
		}//End of for loop
	}//End of printTypeInventory method
	
	
	//Method that prints one Vehicle that matches the user specified VIN.Accepts a string for
	//user specified VIN of the Vehicle and a linked list of type Vehicle.Returns nothing.
	public void printByVIN(String VIN, LinkedList<Vehicle> x) throws Exception {
		
		//For loop to iterate though the linked list
		for(int i = 0; i < x.size(); ++i)
		{
			Vehicle temp = x.get(i);
			//Checks if the VIN is equal to that of the temp Vehicle object
			if(VIN.equals(temp.getVIN()))
					{
					System.out.println("Printing the Vehicle with user specificed VIN number: " + VIN);
					System.out.println("" + i + ":\t" + x.get(i));
			
					}
			
		}//End of for loop
	}//End of the printByVIN method
	
	//Method that prints one (or multiple) Vehicles that matches the user specified Indexes.Accepts an int array for
	//user specified indexes of the Vehicle and a linked list of type Vehicle.Returns nothing.
	public void printVehicleByIndex(int[] userInput,LinkedList<Vehicle> x)
	{
		//Try Catch blocks to catch errors
		try {
			
		//Checks if the userInput array is within the range of the size of the linked list and is bigger then 0
		if(userInput.length <= x.size() && userInput.length >= 0 )
		{
			//For loop to iterate through the int array of user specified indexes
			for(int i = 0; i < userInput.length; i++)
			{
			//Prints out the user indexes along with the linked list Vehicles
			System.out.println("" + userInput[i] + ":" + x.get(userInput[i]).toString());
				
			}
		}
		
		
		else
		{
			System.out.println("Out of bounds for the element index!");
		}
		}//End of try
		
		//Catches any errors
		catch(Exception exe)
		{
			System.out.println("An exeception has occured");
		}
	}//End of printVehicleByIndex method
	
}//End of VehicleInventory class

