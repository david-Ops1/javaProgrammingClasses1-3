package synthesis_project;

public class Task extends Entry {
//Declaring private data members
	private String ProjectName;
	private boolean isCompleted;
	
//Default constructor
public Task()
{
	super();
	ProjectName = "";
	isCompleted = false;
}
//Alt constructor
public Task(String Title, Date StartDate, Date EndDate, String Description, String ProjectName, boolean isCompleted)
{
	super(Title,StartDate,EndDate,Description);
	this.ProjectName = ProjectName;
	this.isCompleted = isCompleted;
}

//Setters
//Sets ProjectName
public void setProjName(String ProjectName)
{
	this.ProjectName = ProjectName;
}

//Sets Status true or false (boolean)
public void setStatus (boolean isCompleted)
{
	this.isCompleted = isCompleted;
}
//Getters

//Gets ProjectName
public String getProjName()
{
	return ProjectName;
}

//Gets isComleted status (False or true)
public boolean getStatus()
{
	return isCompleted;
}

//A String method that returns a String
public String toString()
{
	return super.toString() + "\n" + ProjectName + "\nDone:" + isCompleted;
}
}
