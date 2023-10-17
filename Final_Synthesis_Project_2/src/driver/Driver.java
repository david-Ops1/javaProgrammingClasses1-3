package driver;
import java.util.Scanner;
//David Shenouda
//Final project
//12/21/20
import synthesis_project.*;
public class Driver {
	
	//Int to count each Entry (task/Event)
	private static int numOfEntries = 0;
	//Array to hold Entry list which consist of task and Event objects
	private static Entry[] userCalendar = new Entry[15];
	
static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		
		int option = 500;
		
		
		//Loop for user interface options
		while(option != 6)//Start of While loop
		{
			showMenu();
			option = console.nextInt();
			
			if(option == 1)
			{
				printList();
			}
			
			else if(option == 2)
			{
				addTask();
			}
			
			else if(option == 3)
			{
				addEvent();
			}
			
			else if(option == 4)
			{
				showEntry();
			}
			
			else if(option == 5)
			{
				deleteEntry();
			}
			
			else if(option == 6)
			{
				close();
			}
			
			else
			{
				System.out.println("ERROR!\n your selction: " + option +
				" does not exist as an option this program.Only numbers "
				+ "1-6 are applicable.\n Try again if you wish...");
			}
			
			
	}//End of While loop

	}
	
	//Method to show the menu options
	public static void showMenu() 
	{
		System.out.println("\nOptions Menu:");
		System.out.println("   1. Print List");
		System.out.println("   2. Add Task");
		System.out.println("   3. Add Event");
		System.out.println("   4. Show Entry by Index");
		System.out.println("   5. Delete Entry by Index");
		System.out.println("   6. Close");
		System.out.print("Enter an integer:");
	}
	
	//Method to print out the array of Entries
	public static void printList()
	{
		//Iterates through userCalendar for tasks events 
		for( int i = 0; i < numOfEntries; i++)
			
		{
			System.out.println("\nEntry: " + (i+1));
			
			System.out.println(userCalendar[i].toString());
			
			
		}
	}
	

	
	
	
	//Method to add tasks to the array of Entries
	public static void addTask()
	{
		//Asks user for task title
		System.out.println("You chose add task:\n"
				+ "Please write the title for the task:");
		console.nextLine();
		String title =  console.nextLine();
		
		//Asks user for the projectName
		System.out.println("Please write the project name for the task:");
		String projectName =  console.nextLine();
		
		//Asks user for a String that is either true or false
		System.out.println("Please write if the project is completed (true or false):");
		String userBoolean =  console.nextLine();
		boolean isCompleted = false;
		
		//Checks the string if it is true
		if(userBoolean.equalsIgnoreCase("true"))
		{
			isCompleted = true;
		}
		
		//Checks the user String if it is false
		if(userBoolean.equalsIgnoreCase("false"))
		{
			isCompleted = false;
		}
		
		//Asks the user for a description of the task
		System.out.println("Please write the description for the task.");
		String description =  console.nextLine();
		
		//Get start date info from the user
		System.out.println("Please write the start day for the task.");
		int startDay =  console.nextInt();
		
		System.out.println("Please write the start month for the task.");
		int startMonth =  console.nextInt();
		
		System.out.println("Please write the start year for the task.");
		console.nextLine();
		int startYear =  console.nextInt();
		
		//Create start date object
		Date startDate = new Date(startDay, startMonth, startYear);
		
		
		//Get end date info from user
		System.out.println("Please write the end day for the task.");
		console.nextLine();
		int endDay =  console.nextInt();
		
	
		System.out.println("Please write the end month for the task.");
		int endMonth =  console.nextInt();
		
		System.out.println("Please write the end year for the task.");
		int endYear =  console.nextInt();
		
		//Create end date object
		Date endDate = new Date(endDay, endMonth, endYear);
		
		Task task = new Task(title, startDate, endDate, description, projectName, isCompleted);
		
		//Adds the object Task to the userCalendar array of parent type Entry
		userCalendar[numOfEntries] = task;
		//Adds 1 to the numOfEntries counter
		numOfEntries++;
		
	}
	
	
	
	
	
	
	
	//Method to add Events to the array of Entries
	public static void addEvent()
	{
		System.out.println("You chose add event:\n"
				+ "Please write the title for the event.");
		console.nextLine();
		String title =  console.nextLine();
		
		//Get description from user
		System.out.println("Please write the description for the event.");
		String description =  console.nextLine();
		
		
		
		
		//Get start date info from user
		System.out.println("Please write the start day for the event.");
		int startDay =  console.nextInt();
		
	
		System.out.println("Please write the start month for the event.");
		int startMonth =  console.nextInt();
		
		System.out.println("Please write the start year for the event.");
		console.nextLine();
		int startYear =  console.nextInt();
		
		//Create start date object
		Date startDate = new Date(startDay, startMonth, startYear);
		
		
		
		
		//Get end date info from user
		System.out.println("Please write the end day for the event.");
		console.nextLine();
		int endDay =  console.nextInt();
		
	
		System.out.println("Please write the end month for the event.");
		int endMonth =  console.nextInt();
		
		System.out.println("Please write the end year for the event.");
		int endYear =  console.nextInt();
		
		//Create end date object
		Date endDate = new Date(endDay, endMonth, endYear);
		
		
		
		//Object of type Time to hold startTime
		Time startTime = new Time();
		
		
		boolean  validStartHour = false;
		
		//While loop to check if the starting hour is valid
		while(!validStartHour) {
		//Get start time info form user
		System.out.println("Please write the starting hour for the event:");
		int startingHour =  console.nextInt();
		
		try 
		{
		startTime.setHour(startingHour);
		validStartHour = true;
	
		}
		catch(InvalidHourException invhrEx)
		{
			System.out.println("Invalid hour entered, please re-enter starting hour");	
			
		}
		
		}  //end while
		
		
		
		boolean  validStartMinute = false;
		
		//While loop to check if the starting minute is valid
		while(!validStartMinute) {
		//Get start time info form user
		System.out.println("Please write the starting Minute for the event:");
		int startingMinute =  console.nextInt();
		
		try 
		{
		startTime.setMinute(startingMinute);
		validStartMinute = true;
		}
		catch(InvalidMinuteException invMinEx)
		{
			System.out.println("Invalid minute entered, please re-enter starting minute");
			validStartMinute = false;
		}
		
		}//end while
		
		
		
		boolean  validStartSecond = false;
		
		//While loop to check if the starting second is valid
		while(!validStartSecond) {
		//Get start time info form user
		System.out.println("Please write the starting Second for the event:");
		int startingSecond =  console.nextInt();
		
		try 
		{
		startTime.setSecond(startingSecond);
		validStartSecond = true;
		}
		catch(InvalidSecondException invSecEx)
		{
			System.out.println("Invalid Second entered, please re-enter starting second");
			validStartSecond = false;
		}
		
		}//end while
		
		
		
		//Object of type Time to hold endTime
		Time endTime = new Time();
		
		
		boolean  validEndHour = false;
		
		//While loop to check if the ending hour is valid
		while(!validEndHour) {
		//Get start time info form user
		System.out.println("Please write the ending hour for the event:");
		int endingHour =  console.nextInt();
		
		try 
		{
		endTime.setHour(endingHour);
		validEndHour = true;
		}
		catch(InvalidHourException invhrEx)
		{
			System.out.println("Invalid hour entered, please re-enter ending hour");
			validEndHour = false;
		}
		
		}//end while
		
		
		
		boolean  validEndMinute = false;
		
		//While loop to check if the ending minute is valid
		while(!validEndMinute) {
		//Get start time info form user
		System.out.println("Please write the ending Minute for the event:");
		int endingMinute =  console.nextInt();
		
		try 
		{
		endTime.setMinute(endingMinute);
		validEndMinute = true;
		}
		catch(InvalidMinuteException invMinEx)
		{
			System.out.println("Invalid minute entered, please re-enter ending minute");
			validEndMinute = false;
		}
		
		}//end while
		
		
		
		boolean  validEndSecond = false;
		
		//While loop to check if the ending second is valid
		while(!validEndSecond) {
		//Get start time info form user
		System.out.println("Please write the ending Second for the event:");
		int endingSecond =  console.nextInt();
		
		try 
		{
		endTime.setSecond(endingSecond);
		validEndSecond = true;
		}
		catch(InvalidSecondException invSecEx)
		{
			System.out.println("Invalid Second entered, please re-enter ending second");
			validEndSecond = false;
		}
		
		}//end while
		
	
		
		//Get Location Info from user
		console.nextLine();
		System.out.println("Please write the street number for the event:");
		String streetNumber =  console.nextLine();
		
		System.out.println("Please write the street name for the event:");
		String streetName =  console.nextLine();
		
		System.out.println("Please write the city for the event:");
		String city =  console.nextLine();
		
		System.out.println("Please write the state for the event:");
		String state =  console.nextLine();		
		
		System.out.println("Please write the zip code for the event:");
		String zipCode =  console.nextLine();		
		
		//Create address object
		Address location = new Address(streetNumber, streetName, city, state, zipCode);
		
		//Object of type Event
		Event event = new Event(title, startDate, endDate, description, startTime, endTime, location);
		
		//Adds the object Event to the userCalendar array of parent type Entry
		userCalendar[numOfEntries] = event;
		//Adds 1 to the numOfEntries counter
		numOfEntries++;
		
	}
	
	//Method to show a specific Entry in the array of Entries
	public static void showEntry()
	{
		
		System.out.println("Please provide an index to show(1-15 is valid).");
		int index = console.nextInt();
		try {
		System.out.println(userCalendar[index-1].toString());
		}
		catch(Exception e) {
			System.out.println("Index out of bounds.");
		}
	}
	
	//Method to delete a specific Entry in the array of Entries
	public static void deleteEntry()
	{
		//Index for the deleted entry
		int calIndex;
		//Asks user for Entry to be deleted
		System.out.print("Please specify an index of the "
				+ "Entry needed to be removed from list userCalendar (1-15 is valid):");
		calIndex = console.nextInt();
		
		//Error checking
		try
		{
		//Checks to see if the user index is valid
		if(calIndex <= numOfEntries && calIndex > 0 )
		{
			userCalendar[calIndex - 1] = userCalendar[numOfEntries - 1];
			
			numOfEntries--;
		}
		
		else
		{
			System.out.print("Not a valid index. Entry does not exist.");
		}
		
		}
		//catches the error
		catch(Exception e)
		{
			System.out.print("Not a valid index. Entry does not exist.");
		}
	}
	
	//Method to close the program
	public static void close()
	{
		System.exit(0);
	}
	
	
}
