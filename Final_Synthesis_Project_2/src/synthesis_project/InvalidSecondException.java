package synthesis_project;

public class InvalidSecondException extends Exception {
	
	public InvalidSecondException() {
		super("Invalid Second! Only integers 0-59 are allowed" 
				+ "(Military Time)");
	}
}
