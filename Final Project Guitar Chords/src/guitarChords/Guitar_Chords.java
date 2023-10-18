package guitarChords;
//David Shenouda 5/10/2020 Final Project: Guitar Chords CSIS 162-03
//Imports
import java.util.Scanner;
import java.io.*;
import java.util.Random; 
import java.lang.String;
public class Guitar_Chords {
//declaring Chorp as a private String
private String Chordp;
//Declaring the Scanner for console inputs
public static Scanner console = new Scanner(System.in);

//Main method throws IOException if there is something wrong with the output file
	public static void main(String args[]) throws IOException  {
	
		FileWriter fWriter = new FileWriter ("myChords.dat");//Declaring the FileWriter and specifying what file to store the output
		PrintWriter pWriter = new PrintWriter (fWriter);//Declaring the PrintWriter that allows one to write to the output file
		
		//Declaring the 5 sets of chord variables as Strings
		String chordSet1 = "BC1";
		String chordSet2 = "Bm";
		String chordSet3 = "BC2";
		String chordSet4 = "D7O1";
		String chordSet5 = "D7O2";
		
		
		Random rGen = new Random();//Declaring the random number generator as rGen
		
		//Declaring the 5 set chord arrays to store each of the 3 chords in each set into an array of objects
		Guitar_Chords chordArray1[] = new Guitar_Chords[3];
		Guitar_Chords chordArray2[] = new Guitar_Chords[3];		
		Guitar_Chords chordArray3[] = new Guitar_Chords[3];
		Guitar_Chords chordArray4[] = new Guitar_Chords[3];
		Guitar_Chords chordArray5[] = new Guitar_Chords[3];
		
		//Initializing each of the three elements(0,1,2) in each array to the correct chord for each set of chords
		//By using a constructor to set and get each value in the array
		//Chord set BC1
		chordArray1[0] = new Guitar_Chords("D");
		chordArray1[1] = new Guitar_Chords("A");
		chordArray1[2] = new Guitar_Chords("E");
		
		//Chord set Bm
		chordArray2[0] = new Guitar_Chords("Am");
		chordArray2[1] = new Guitar_Chords("Dm");
		chordArray2[2] = new Guitar_Chords("Em");
		
		//Chord set BC2
		chordArray3[0] = new Guitar_Chords("G");
		chordArray3[1] = new Guitar_Chords("C");
		chordArray3[2] = new Guitar_Chords("F");
		
		//Chord set D7O1
		chordArray4[0] = new Guitar_Chords("G7");
		chordArray4[1] = new Guitar_Chords("C7");
		chordArray4[2] = new Guitar_Chords("B7");
		
		//Chord set D702
		chordArray5[0] = new Guitar_Chords("D7");
		chordArray5[1] = new Guitar_Chords("A7");
		chordArray5[2] = new Guitar_Chords("E7");
		
		
		String chordSet = Guitar_Chords.question();//Caller to for method question receives a String
		
	if(!chordSet.equals("custom")) {//Checks to see if the String chordSet does not equal custom
		
		System.out.println("Enter the number of chords to print:");//Prompts the user to type the number of chords wanted in each iteration
		int numOfChords =console.nextInt();//Stores the number in the int variable numOfChords 
		
		System.out.println("Enter the number of progressions to create:");//Prompts the user to type in the number of times to randomize the chords
		int numOfProgressions = console.nextInt();//Stores the number in the in variable numOfProgressions
	
		if (chordSet.equals (chordSet1)){//Checks to see if chordSet equals BC1
			for(int idx = 0; idx < numOfProgressions; ++idx) {//for loop to go through each progression of chords
				int counter=idx + 1;//Declaring int counter to account for element zero
				
				System.out.println("\nChord Progression: " + counter );//Displays the number of progressions
				System.out.println();
				
				pWriter.println("\nChord Progression: " + counter );//Prints to the .dat file the number of progressions
				pWriter.println();
				
				for(int idx2 = 0; idx2 < numOfChords; ++idx2) {//for loop to print each chord in each progression
					int random = rGen.nextInt(3);// Allows int random to become one of three elements in chordArray
					
					if (idx2 != 0 && idx2 % 10 == 0) {//Formats the chords to 10 chords per row (0%10=0 and 10%10 = 0)
				        System.out.println();
				        pWriter.println();
					}
					
					System.out.print(chordArray1[random].retrieveChord() + "\t");//Gets the random chord then prints to console (tab delimited)
					pWriter.print(chordArray1[random].retrieveChord() + "\t");//Gets the random chord then prints to dat file (tab delimited)
			}
				System.out.println();
				pWriter.println();
			}
		}
		if (chordSet.equals(chordSet2)){//Checks to see if chordSet equals Bm
			for(int idx = 0; idx < numOfProgressions; ++idx) {//for loop to go through each progression of chords
				int counter=idx + 1;//Declaring int counter to account for element zero
				
				System.out.println("\nChord Progression: " + counter );//Displays the number of progressions
				System.out.println();
				
				pWriter.println("\nChord Progression: " + counter );//Prints to the .dat file the number of progressions
				pWriter.println();
				
				for(int idx2 = 0; idx2 < numOfChords; ++idx2) {//for loop to print each chord in each progression
					int random = rGen.nextInt(3);// Allows int random to become one of three elements in chordArray
					
					if (idx2 != 0 && idx2 % 10 == 0) {//Formats the chords to 10 chords per row (0%10=0 and 10%10 = 0)
				        System.out.println();
				        pWriter.println();
					}
					
					System.out.print(chordArray2[random].retrieveChord() + "\t");//Gets the random chord then prints to console (tab delimited)
					pWriter.print(chordArray2[random].retrieveChord() + "\t");//Gets the random chord then prints to dat file (tab delimited)
			}
				System.out.println();
				pWriter.println();
			}
		}
		if (chordSet.equals (chordSet3)){//Checks to see if chordSet equals BC2
			for(int idx = 0; idx < numOfProgressions; ++idx) {//for loop to go through each progression of chords
				int counter=idx + 1;//Declaring int counter to account for element zero
				
				System.out.println("\nChord Progression: " + counter );//Displays the number of progressions
				System.out.println();
				
				pWriter.println("\nChord Progression: " + counter );//Prints to the .dat file the number of progressions
				pWriter.println();
				
				for(int idx2 = 0; idx2 < numOfChords; ++idx2) {//for loop to print each chord in each progression
					int random = rGen.nextInt(3);// Allows int random to become one of three elements in chordArray
					
					if (idx2 != 0 && idx2 % 10 == 0) {//Formats the chords to 10 chords per row (0%10=0 and 10%10 = 0)
				        System.out.println();
				        pWriter.println();
					}
					
					System.out.print(chordArray3[random].retrieveChord() + "\t");//Gets the random chord then prints to console (tab delimited)
					pWriter.print(chordArray3[random].retrieveChord() + "\t");//Gets the random chord then prints to dat file (tab delimited)
			}
				System.out.println();
				pWriter.println();
			}
		}
		if (chordSet.equals(chordSet4)) {//Checks to see if chordSet equals D7O1
			for(int idx = 0; idx < numOfProgressions; ++idx) {//for loop to go through each progression of chords
				int counter=idx + 1;//Declaring int counter to account for element zero
				
				System.out.println("\nChord Progression: " + counter );//Displays the number of progressions
				System.out.println();
				
				pWriter.println("\nChord Progression: " + counter );//Prints to the .dat file the number of progressions
				pWriter.println();
				
				for(int idx2 = 0; idx2 < numOfChords; ++idx2) {//for loop to print each chord in each progression
					int random = rGen.nextInt(3);// Allows int random to become one of three elements in chordArray
					
					if (idx2 != 0 && idx2 % 10 == 0) {//Formats the chords to 10 chords per row (0%10=0 and 10%10 = 0)
				        System.out.println();
				        pWriter.println();
					}
					
					System.out.print(chordArray4[random].retrieveChord() + "\t");//Gets the random chord then prints to console (tab delimited)
					pWriter.print(chordArray4[random].retrieveChord() + "\t");//Gets the random chord then prints to dat file (tab delimited)
			}
				System.out.println();
				pWriter.println();
			}
		}
		if (chordSet.equals(chordSet5)) {//Checks to see if chordSet equals D7O2
			for(int idx = 0; idx < numOfProgressions; ++idx) {//for loop to go through each progression of chords
				int counter=idx + 1;//Declaring int counter to account for element zero
				
				System.out.println("\nChord Progression: " + counter );//Displays the number of progressions
				System.out.println();
				
				pWriter.println("\nChord Progression: " + counter );//Prints to the .dat file the number of progressions
				pWriter.println();
				
				for(int idx2 = 0; idx2 < numOfChords; ++idx2) {//for loop to print each chord in each progression
					int random = rGen.nextInt(3);// Allows int random to become one of three elements in chordArray
					
					if (idx2 != 0 && idx2 % 10 == 0) {//Formats the chords to 10 chords per row (0%10=0 and 10%10 = 0)
				        System.out.println();
				        pWriter.println();
					}
					
					System.out.print(chordArray5[random].retrieveChord() + "\t");//Gets the random chord then prints to console (tab delimited)
					pWriter.print(chordArray5[random].retrieveChord() + "\t");//Gets the random chord then prints to dat file (tab delimited)
			}
				System.out.println();
				pWriter.println();
			}
		
		
		}
	}
	if(chordSet.contentEquals("custom")) {//Checks to see if chordSet equals custom
		boolean flag = false;//Declaring false flag for while loop
		String customInput;//Declaring customIput to hold users set of custom chords
		
		System.out.println("Enter the chords, seperated by spaces (max 20)");//Prompts the user for a set of custom chords
		customInput =console.nextLine();//Stores the chords separated by spaces in a String variable customInput
		
		while(!flag) {//false flag while loop to see if the number of chords stored doesn't exceed the max of 20 chords
		String[]arrayOfCustom = customInput.split("\\s+");//Declares a String array to store the chord after each space 
		//in the String customInput into the String array counterCustom so it can be counted
		
		int counterCustom = arrayOfCustom.length;//Counts the number of elements in the String array arrayOfCustom and stores the number into int counterCustom
		
		if (counterCustom <=20) {//Checks to see if the number of chords in counterCustom is less then or equal to 20 chords
		flag=true;//Sets flag to true to exit while loop
		}
		
		else {//if Over 20 chords a prompt asks the user to enter a number of chords equal to or less then 20 (repeats while loop)
		System.out.println("Sorry. Only 20 chords are allowed. Enter the chords, seperated by spaces (MAX 20)");
		customInput =console.nextLine();
		
		}
		}
		
		String [] customChordsArray = customInput.split(" ");//Stores each chord after each space into a String array
		
		System.out.println("Enter the number of chords, to output to console:");//Prompts the user to type the number of chords wanted in each iteration
		int numOfChords1  = console.nextInt();
		
		System.out.println("Enter the number of progressions to create:");//Prompts the user to type in the number of times to randomize the chords
		int numOfProgressions1 = console.nextInt();
		
		for(int idx = 0; idx < numOfProgressions1;++idx) {//for loop to go through each progression of chords
			int counter=idx + 1;//Declaring int counter to account for element zero
			
			System.out.println("\nChord Progression: " + counter );//Displays the number of progressions
			System.out.println();
			
			pWriter.println("\nChord Progression: " + counter );//Prints to the .dat file the number of progressions
			pWriter.println();
			
			for(int idx2 = 0; idx2 < numOfChords1; ++idx2) {//for loop to print each chord in each progression
				
				if (idx2 != 0 && idx2 % 10 == 0) {//Formats the chords to 10 chords per row (0%10=0 and 10%10 = 0)
			        System.out.println();
			        pWriter.println();
				}
				
			int random = rGen.nextInt(customChordsArray.length);//Allows int random to become one of the elements in customChordsArray
			
			System.out.print(customChordsArray[random]+ "\t");//Gets the random chord then prints to console (tab delimited)
			pWriter.print(customChordsArray[random]+ "\t");//Gets the random chord then prints to dat file (tab delimited)
		}
			
			System.out.println();
			pWriter.println();
	}
		
	}
	pWriter.close();//Close the PrintWriter
}
				
	
	//Default constructor
	public Guitar_Chords() {
		
	}
	//Setter for each array of objects sets each one to Chordp (receives a String which is a single chord)
	public Guitar_Chords(String Chord) {
		this.Chordp = Chord;
		
	}
	//Getter for each array of objects sends backs Chordp
	public  String retrieveChord() {
		return this.Chordp;
	}
	//Custom method that sends back a String specifying what chord set the user wants
	public static String question () {
		System.out.println("Enter a chord set (Options: BC1, Bm, BC2, D7O1, D7O2 or custom):");//Prompts the user to type in a chord set
		String chordSetm =console.nextLine();//Stores the chord set into a String called chordSetm
		return chordSetm;//Returns the String to the caller
	}
}

