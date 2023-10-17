package synthesis_project;

public class Address {
//Private data members for class Address
private String Number;
private String Street;
private String City;
private String State;
private String Zip;


//Default Constructor
public Address(){
	Number = "";
	Street = "";
	State = "";
	Zip = "";
}

//Alt Constructor
public Address(String Number,String Street,String City, String State, String Zip)
{
	this.Number = Number;
	this.Street = Street;
	this.City = City;
	this.State = State;
	this.Zip = Zip;
}

//Getters

//Gets Number
public String getNumber(){
	return Number;
}

//Gets Street
public String getStreet() {
	return Street;
}

//Gets City
public String getCity() {
	return City;
}

//Gets State
public String getState() {
	return State;
}

//Gets Zip
public String getZip() {
	return Zip;
	
}
//Setters
//Sets Number
public void setNumber(String Number){
	this.Number = Number;
}

//Sets Street
public void setStreet(String Street) {
	this.Street = Street;
	
}
//Sets City
public void setCity(String City) {
	this.City = City;
	
}

//Sets State
public void setState(String State) {
	this.State = State;
	
}

//Sets Zip
public void setZip(String Zip) {
	this.Zip = Zip;
	
}

//A String method that return the full address with Number, Street, 
//City, State, and Zip in that order.
public String toString() {
	return Number + "," + Street + "," + City + "," + State + "," +
			Zip;
}
}