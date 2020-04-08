package JUnitTestTempl;

/*
* The general utility class that needs to tested. 
*/
public class GeneralUtilTempl {

	private String message;

	// Constructor
	// @param message to be printed
	public GeneralUtilTempl(String message) {
		this.message = message;
	}

	public GeneralUtilTempl() {
		// TODO Auto-generated constructor stub
	}

	// prints the message
	public void printMessage() {
		System.out.println(message);
		int a = 0;
		int b = 1 / a;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

	//
	public Boolean validate(final Integer primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}
