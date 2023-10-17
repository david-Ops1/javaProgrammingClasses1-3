package synthesis_project;

public class InvalidHourException extends Exception{

	public InvalidHourException() {
		super("Invalid Hour! Only integers 0-23 are allowed"
				+ " (Military Time)");
	}

}
