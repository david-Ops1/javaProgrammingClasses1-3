package assignment8e;
//David Shenouda CSIS 162-03 5/1/20
public class friendClass {
//Variables declared in class
private String lastName;
private String firstName;
private int age;

//Default constructor
public friendClass() {

}
	//Constructor for the last name, first name and age of a friend
	public friendClass(String lastname1, String firstName1, int age1) {
		this.lastName = lastname1;
		this.firstName = firstName1;
		this.age = age1;
	}
	
	//Modifier method to change last name of a class instance (friend)
	public void applyLastName(String lastName1){
		this.lastName = lastName1;
		
	}
	//Modifier method to change first name of a class instance (friend)
	public void applyFirstName(String firstName1){
		this.firstName = firstName1;
		
	}
	//Modifier method to change age of a class instance (friend)
	public void applyAge(int age1) {
		this.age =age1;
	
	}
	//Accessor method to return the last name of a instance (friend)
	public  String retrieveLastName() {
		return this.lastName;
	}
	//Accessor method to return the first name of a instance (friend)
	public  String retrieveFirstName() {
		return this.firstName;
	}
	//Accessor method to return the age of a instance (friend)
	public int retrieveAge() {
		return this.age;
				
	}
	//Prints all instances variables to the console
	public void printFriend() {
		
		System.out.println("\tFirstName:\t" + this.firstName);
		System.out.println("\tLastName:\t" + this.lastName);
		System.out.println("\tAge:\t\t" + this.age);
		}
}