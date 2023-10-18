package gameOfNumbers;
import javax.swing.*; 
public class GameOfNumbers {

	public static void main(String[] args) {
	/* CSIS 161
	 * David Shenouda
	 * Program #6
	 * Class period MWF 10-10:50 A.M.
	 * 
	 * This program emulates a random number guessing game. The user gets 5 tries to guess the
	 * random computer generated number between 0 and 99. If the user is incorrect on the 5th try 
	 * the user loses. If the user guesses the correct number the user wins.
	*/
		//declare the variables 
		
		int num;       //variable to store the random number
		int guess;     //variable to store the number guessed by the user
		int diff;      //variable to store the difference between the user guessed number and the random number
		int i = 0;     //variable to store the number of tries
		String strGuess; 
		boolean done; //boolean variable to control the loop 
		num = (int) (Math.random() * 100); //Calculation for the randomly generated number
		done = false; //flag

		while (!done && i < 5) {  //while loop
		i++;

		strGuess=JOptionPane.showInputDialog("Enter an integer:\nGreater than or equal zero and less than a hundred"); //asks user to input guess

		guess = Integer.parseInt(strGuess); System.out.println(); //changes user string into integer
		diff=Math.abs(num-guess); //Calculation for the absolute value of the difference between user's number and system's number
		if (diff == 0) { //checks for equality
		JOptionPane.showMessageDialog(null,"YOU WIN!\nYou guessed the correct number."); //user guess is the same of the system and therefore wins
		done = true; //changes the flag to true
		} //end of true
		
		else { //if the user guess is not correct a series of if and else give hints to the system's number
				
			if (diff >= 50) {
				if (guess > num)
				   JOptionPane.showMessageDialog(null,"Your guess is very high.");
			   else   
				   JOptionPane.showMessageDialog(null,"Your guess is very low.");
			}
		   else if (diff >=30) {
			   if (guess > num) 
				   JOptionPane.showMessageDialog(null,"Your guess is high.");
			   else 
				   JOptionPane.showMessageDialog(null,"Your guess is low."); 
		   	}
		   
		   else if (diff>=15) {
			   if (guess > num) 
				   JOptionPane.showMessageDialog(null,"Your guess is moderately high."); 
			   else 
				   JOptionPane.showMessageDialog(null,"Your guess is moderately low.");
			}
		   else if (diff > 0) {
			   if (guess > num) 
				   JOptionPane.showMessageDialog(null,"Your guess is somewhat high.");
			   else 
				   JOptionPane.showMessageDialog(null,"Your guess is somewhat low."); 
			}
		
		}//end of else
		} //end while 
		if(!done) {//display message that they lost
			   JOptionPane.showMessageDialog(null,"GAME OVER!\nYou have used your maximum number of guesses.");
		}
		} //end of main 

}//end of class 