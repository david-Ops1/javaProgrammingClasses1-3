package synthesis_project;

public class Date {
//Private data members for class Date
private int Day;
private int Month;
private int Year;

//Default Constructor
public Date(){
	Day = 0;
	Month = 0;
	Year = 0;
}

//Alt Constructor
public Date(int Day, int Month, int Year)
{
	this.Day = Day;
	this.Month = Month;
	this.Year = Year;
}
//Getters

//Gets Day
public int getDay() {
	return Day;
}

//Gets Month
public int getMonth(){
	return Month;
}

//Gets Year
public int getYear() {
	return Year;
}

//Setters

//Sets Day
public void setDay(int Day) {
	this.Day = Day;
}

//Sets Month
public void setMonth(int Month) {
	this.Month = Month;
}

//Sets Year
public void setYear(int Year) {
	this.Year = Year;
}

//A String method that returns the date in Day/Month/Year (military format)
public String toString() {
	return Day + "/" + Month + "/" + Year;
}
}
