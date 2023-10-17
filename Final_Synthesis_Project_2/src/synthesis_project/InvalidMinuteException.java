package synthesis_project;

public class InvalidMinuteException extends Exception {

	public InvalidMinuteException() {
		super("Invalid Minute! Only integers 0-59 are allowed" 
				+ "(Military Time)");
	}

}
