package Exception_Handling;

public class LoginException extends Exception{
	public LoginException() {
		super("Invalid Authentication");
	}
}
