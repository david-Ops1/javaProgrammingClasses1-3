package synthesis_project;

abstract public class Entry {
//Private data members
private String Title;
private Date StartDate;
private Date EndDate;
private String Description;



//Default constructor
public Entry(){
	Title = "";
	StartDate = new Date();
	EndDate= new Date();
	Description = "";
}

//Alt constructor
public Entry(String Title, Date StartDate, Date EndDate, String Description) 
{
	this.Title = Title;
	this.StartDate = StartDate;
	this.EndDate = EndDate;
	this.Description = Description;
}

//Setters
//Sets Title
public void setTitle(String Title)
{
	this.Title = Title;
}

//Sets StartDate
public void setStartDate (Date StartDate)
{
	this.StartDate = StartDate;
}

//Sets EndDate
public void setEndDate (Date EndDate)
{
	this.EndDate = EndDate;
}

//Sets Description
public void setDescription(String Description)
{
	this.Description = Description;
}


//Getters
//Gets Title
public String getTitle()
{
	return Title;
}

//Gets StartDate
public Date getStartDate()
{
	return StartDate;
}

//Gets EndDate
public Date getEndDate()
{
	return EndDate;
	
}

//Gets Description
public String getDescription()
{
	return Description;
}


//A String method that combines Title,StartDate,EndDate, and Description
//And send it back as a String
public String toString()
{
	return "\n" + Title + "\n" + StartDate + "-" + EndDate + "\n" + Description;
}
}