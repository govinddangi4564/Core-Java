package ExeptionHandling;

public class LoginException extends Exception {
	public LoginException() {
		super("Incorrect User Name or Password");
	}
}
