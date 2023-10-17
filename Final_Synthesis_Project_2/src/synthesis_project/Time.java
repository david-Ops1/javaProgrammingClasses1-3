package synthesis_project;

public class Time {
//Private data members
private int Hour;
private int Minute;
private int Second;

//Default Constructor
public Time(){
	Hour = 0;
	Minute = 0;
	Second = 0;
}

//Alt constructor
public Time(int Hour, int Minute, int Second) throws Exception {
	
		//This is a block to see if the Hour is a valid input from the user
		if(Hour < 0 || Hour > 23) 
		{
			throw new InvalidHourException();
		}
		this.Hour = Hour;
	
		//This is a block to see if the Minute is a valid input from the user
		if(Minute < 0 || Minute > 59) 
		{
			throw new InvalidMinuteException();
		}
		
		this.Minute = Minute;
	
	
	
		//This is a  block to see if the Second is a valid input from the user
		if(Second < 0 || Second > 59) 
		{
			throw new InvalidSecondException();
		}
		
		this.Second = Second;
}//End of Time constructor

//Getters

//Gets Hour
public int getHour() {
	return Hour;
}

//Gets Minute
public int getMinute() {
	return Minute;
}

//Gets Second
public int getSecond() {
	return Second;
}


//Setters
//Sets Hour
public void setHour(int Hour) throws InvalidHourException  {

		if(Hour < 0 || Hour > 23) 
		{
			throw new InvalidHourException();
		}
		
		this.Hour = Hour;	
}


//Sets Minute
public void setMinute(int Minute) throws InvalidMinuteException{
	
		if(Minute < 0 || Minute > 59) 
		{
			throw new InvalidMinuteException();
		}
		
		this.Minute = Minute;
	
}


//Sets Second
public void setSecond(int Second) throws InvalidSecondException {

		if(Second < 0 || Second > 59) 
		{
			throw new InvalidSecondException();
		}
		
		this.Second = Second;

}


//toString method that returns Hour, Minute and Second in a
//Military time format
public String toString() {
	return Hour + ":" + Minute + ":" + Second;
}
}
