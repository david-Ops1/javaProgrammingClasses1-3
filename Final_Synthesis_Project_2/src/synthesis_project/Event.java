package synthesis_project;

public class Event extends Entry {
//Private Data members
private Time StartTime;
private Time EndTime;
private Address Location;

//Default constructor
public Event(){
	super();
	StartTime = new Time();
	EndTime = new Time();
	Location = new Address();
	
}
//Alt constructor
public Event(String Title, Date StartDate, Date EndDate, String Description, Time StartTime, Time EndTime, Address Location) {
	super(Title, StartDate, EndDate, Description);
	this.StartTime = StartTime;
	this.EndTime = EndTime;
	this.Location = Location;
	
	
}
//Defines inherited Parent Method Title by getting the Title
//Setters
//Sets StartTime
public void setStartTime(Time StartTime)
{
	this.StartTime = StartTime;
}

//Sets EndTime
public void setEndTime(Time EndTime)
{
	this.EndTime = EndTime;
}

//Sets Location
public void setLocation(Address Location)
{
	this.Location = Location;
}

//Getters

//gets StartTime
public Time getStartTime()
{
	return StartTime;
}

//Gets EndTime
public Time getEndTime()
{
	return EndTime;
}

//Gets Location
public Address getLocation()
{
	return Location;
}

//A string method that combines an inherited string from Entry and the 
//variables StartTime, EndTime and Location and sends it back as a String
public String toString()
{
	return super.toString() + "\n" + StartTime + "-" + EndTime + "\n" + Location;
}
}
