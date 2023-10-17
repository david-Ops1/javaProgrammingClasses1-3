package finalproject2;
//David Shenouda
//5/6/21
//CSIS 237-90
import java.util.Scanner;
import java.util.LinkedList;
public class Driver {

		//User interface menu method
		public static void printMenu() {
			System.out.println("\n\n***** OPTIONS MENU *****");
			System.out.println("   1. Print Inventory");
			System.out.println("   2. Print Inventory by Type");
			System.out.println("   3. Print Vehicle by Index");
			System.out.println("   4. Print Vehicle by VIN");
			System.out.println("   5. Add New Vehicle Entry");
			System.out.println("   6. Update Vehicle Entry");
			System.out.println("   7. Remove Vehicle by Index");
			System.out.println("   8. Remove Vehicle by VIN");
			System.out.println("   9. Find Vehicle by VIN");
			System.out.println("   10.Find Vehicle by Type");
			System.out.println("   11.Find Cheapest Vehicle");
			System.out.println("   12.Find Cheapest Vehicle by Type");
			System.out.println("   13.Find Vehicles in MSRP Range");
			System.out.println("   14.Find Vehicles by Type in MSRP Range");
			System.out.println("   15.Exit Program");
			System.out.print("Please enter integer of your choice: ");
		}
		
		
		public static void main(String[] args) throws Exception  {//Start of main
			
			//Declaring a linked list of type Vehicle
			LinkedList<Vehicle> VehInv = new LinkedList<Vehicle>();
			//Declaring a object of type VehicleInventory to access the methods within that class
			VehicleInventory VehInvClass = new  VehicleInventory();
			
			
			Scanner console = new Scanner(System.in);
			
			int userChoice = 100;
			
			//While loop to cycle through each user pass
			while(userChoice != 15)
			{
				//Prints the menu method
				printMenu();
				
					//Accepts user input (1-15)
					userChoice = console.nextInt();
	
				//Prints all Inventory
				if(userChoice == 1) 
				{
					System.out.println("Option 1 selected: Print Inventory...");
					VehInvClass.printAllInventory(VehInv.size(),VehInv);
				}
				
				//Prints all inventory ordered by Vehicle type
				else if(userChoice == 2) 
				{
					System.out.println("Option 2 selected: Print Inventory by Type...");
					VehInvClass.printTypeInventory(VehInv.size(),VehInv);
				}
				
				//Prints multiple Vehicle based of the user specified indexes
				else if(userChoice == 3) 
				{
					System.out.println("Option 3 selected: Print Vehicle by Index...");
					//Asking for user the amount of Vehicles they want printed
					System.out.println("How many Vehicles do you want to print?");
					int printnum = console.nextInt();
					
					//Initializing an array of type int with the user specified amount of Vehicles
					int [] VehicleIdx = new int[printnum];
					//Asking for the linked list indexes of the Vehicles the user wants printed
					System.out.println("Which Vehicles do you want print? (space each index out)");
					
					//For loop to accept each index in an array of ints
					for(int idx = 0; idx < printnum; idx++)
					{
						VehicleIdx[idx] = console.nextInt();
					}//End of for loop
					
					//Caller
					VehInvClass.printVehicleByIndex(VehicleIdx,VehInv);
					
				}
				
				//Prints user specified Vehicle by VIN
				else if(userChoice == 4) 
				{
					System.out.println("Option 4: Print Vehicle by VIN...");
					//Asking the user for the VIN number
					System.out.println("What is the Vehicle's VIN number you wish to print?:");
					String printVIN = console.next();
					//Caller
					VehInvClass.printByVIN(printVIN, VehInv);
					
				}
				
				//Adds a new Vehicle to the linked list
				else if(userChoice == 5) 
				{
					System.out.println("Option 5: Add New Vehicle Entry...");
					//Caller
					VehInv.add(VehInvClass.addVehicle());
				}
				
				//Updates the user specified Vehicle object
				else if(userChoice == 6) 
				{
					System.out.println("Option 6: Update Vehicle Entry...");
					//Asking the user for the specific index of the Vehicle object
					System.out.println("Which Vehicle do you wish to update?");
					int updateIdx = console.nextInt();
					//Caller
					VehInvClass.updateVehicle(updateIdx, VehInv);
				}
				
				//Removes a Vehicle from the linked list by index
				else if(userChoice == 7) 
				{
					System.out.println("Option 7: Remove Vehicle by Index...");
					//Asking the user for the specific index of the Vehicle object
					System.out.println("What Vehicle would you like to remove?(starts at element 0):");
					int idxVeh = -1;
					idxVeh = console.nextInt();
					//Caller
					VehInvClass.removeByIndex(idxVeh, VehInv);
				}
				
				//Removes a Vehicle from the linked list by VIN number
				else if(userChoice == 8) 
				{
					System.out.println("Option 8: Remove Vehicle by VIN...");
					//Asking the user for the specific VIN of the Vehicle object
					System.out.println("What is the Vehicle's VIN number you wish to remove?:");
					String remVIN = console.next();
					//Caller
					VehInvClass.removeByVIN(remVIN, VehInv);
				}
				
				//Finds the Vehicle by VIN number
				else if(userChoice == 9) 
				{
					System.out.println("Option 9: Find Vehicle by VIN...");
					//Asking the user for the specific VIN of the Vehicle object
					System.out.println("What is the Vehicle's VIN number you wish to find?:");
					String findVIN = console.next();
					//Caller
					int foundVIN =VehInvClass.findByVIN(findVIN, VehInv);
					//Prints out the specific index in the linked list
					System.out.println("" + foundVIN + "");
				}
				
				//Finds Vehicles by Type
				else if(userChoice == 10) 
				{
					System.out.println("Option 10: Find Vehicle by Type...");
					//Asking the user for the specific Type of the Vehicle object
					System.out.println("What type of Vehicles are you look for? (Only 3 types: car, truck or SUV)");
					String type = console.next();
					//Caller
					int [] VehType = VehInvClass.findByType(type, VehInv);
					
					
					System.out.println("These are the index's of the type of vehicle:" + type + "");
					//Prints out the int array of Vehicles using a for loop
					for(int i = 0; i < VehType.length; i++)
					{
						System.out.println("" + i + ": \t " + VehType[i]);
					}
				}
				
				//Finds the cheapest Vehicle
				else if(userChoice == 11) 
				{
					System.out.println("Option 11: Find Cheapest Vehicle...");
					//Caller
					int cheapestVeh = VehInvClass.findCheapest(VehInv);
					//To get the correct index subtract one if the cheapest isn't 0
					if(cheapestVeh !=0)
					{
					cheapestVeh--;
					}
					//Checks if the index is bigger then 0 and smaller then the linked list
					if(cheapestVeh < VehInv.size() && cheapestVeh >= 0)
					{
						//Prints out the cheapest Vehicle in the linked list
						System.out.println("" + cheapestVeh + ": \t" + VehInv.get(cheapestVeh).toString());
					}
					else
					{
						System.out.println("element index is invalid!");
					}
					
				}
				
				//Finds the cheapest vehicle by type
				else if(userChoice == 12) 
				{
					System.out.println("Option 12: Find Cheapest Vehicle by Type...");
					//Asking the user for the type of Vehicle
					System.out.println("What type of Vehicle (car,truck,SUV) do you want to find the cheapest in?");
					String Type = console.next();
					//Caller
					int cheapestVeh = VehInvClass.findTypeCheapest(Type,VehInv);
					
					//Checks if the index is bigger then 0 and smaller then the linked list
					if(cheapestVeh < VehInv.size() && cheapestVeh >= 0)
					{
						//Prints out the cheapest Vehicle in the linked list
						System.out.println("" + cheapestVeh + ": \t" + VehInv.get(cheapestVeh).toString());
					}
					else
						System.out.println("element index is invalid!");
					
				}
				
				//Finds Vehicles within the user's specified price range
				else if(userChoice == 13) 
				{
					System.out.println("Option 13: Find Vehicle in MSRP Range...");
					//Asking the user for the lower bound of the price range
					System.out.println("What is the lower bound for the MSRP Range?");
					double LB = console.nextDouble();
					
					//Asking the user for the upper bound of the price range
					System.out.println("What is the upper bound for the MSRP Range?");
					double UB = console.nextDouble();
					//Caller
					int [] inRange = VehInvClass.findRangeMSRP(LB,UB,VehInv);
					
					System.out.println("These are the indexes for the Vehicles in your price range:");
					//For loop to print out the int array that contains all the Vehicles that are within the user's price range
					for(int i = 0; i < inRange.length; i++)
					{
						System.out.println("<" + i + "> \t " + inRange[i]);
					}
					
				}
				
				//Finds Vehicles within the user's specified price range and Vehicle type
				else if(userChoice == 14) // Option 2
				{
					System.out.println("Option 14: Find Vehicles by Type in MSRP Range...");
					//Asking the user for the lower bound of the price range
					System.out.println("What is the lower bound for the MSRP Range?");
					double LB = console.nextDouble();
					
					//Asking the user for the upper bound of the price range
					System.out.println("What is the upper bound for the MSRP Range?");
					double UB = console.nextDouble();
					
					//Asking the user for the Vehicle type
					System.out.println("What type of Vehicle are you looking for?");
					String Type = console.next();
					//Caller
					int [] inRange = VehInvClass.findTypeRangeMSRP(LB,UB,Type,VehInv);
					
					System.out.println("These are the indexes for the " + Type + "s in your price range:");
					//For loop to print out the int array that contains all the Vehicles that are within the user's price range and the right type
					for(int i = 0; i < inRange.length; i++)
					{
						System.out.println("<" + i + "> \t " + inRange[i]);
					}
					
				}
				
				//Exits the program
				else if(userChoice == 15) // Option quit
				{
					System.out.println("Option 15: Exit Program...");
				}
				//If the user types is an int larger then 15 or below 1
				else
				{
					System.out.println("Error! Option " + userChoice + 
							" is not known. \nPlease try again.");
					
				}
			}//End of While
			
			System.out.println("\n\nProgram has closed.");
			console.close();

	
	}//End of main 

		

}//End of Driver class
