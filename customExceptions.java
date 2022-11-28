package userValidation;


import static org.junit.Assert.assertTrue;
import java.util.Scanner;

import org.junit.Test;

public class customExceptions {
	
	Scanner sc = new Scanner(System.in);
	UserValidation user = new UserValidation();
	
	@Test
	public void givenFirstName_WhenFalse() throws InvalidFirstNameException {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		boolean result = user.checkFirstName(firstName);
		if (!result) {
			try {
				throw new InvalidFirstNameException();
			} catch (InvalidFirstNameException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			System.out.println("Test case pass");
			assertTrue("Happy", result);
		}
	}

	class InvalidFirstNameException extends Exception {
		   public void printCause() {
			System.out.println("Invalid FIRST Name Exception");
		}	
	}
	
	
	@Test
	public void givenlastName_WhenFalse() throws InvalidLastNameException {
		System.out.println("Enter last Name");
		String lastName = sc.next();
		boolean result = user.checklastName(lastName);
		if (!result) {
			try {
				throw new InvalidLastNameException();
			} catch (InvalidLastNameException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			System.out.println("Test case pass");
			assertTrue("Happy", result);
		}
	}

	class InvalidLastNameException extends Exception {
		   public void printCause() {
			System.out.println("Invalid Last Name Exception");
		}	
	}
	
	
	@Test
	public void givenEmailWhenFalse() throws InvalidEmailException {
		System.out.println("Enter Email Name");
		String email = sc.next();
		boolean result = user.checkemail(email);
		if (!result) {
			try {
				throw new InvalidEmailException();
			} catch (InvalidEmailException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			System.out.println("Test case pass");
			assertTrue("Happy", result);
		}
	}

	class InvalidEmailException extends Exception {
		   public void printCause() {
			System.out.println("Invalid Email Exception");
		}	
	}
	
	@Test
	public void givenpasswordWhenFalse() throws InvalidpasswordException {
		System.out.println("Enter password Name");
		String password = sc.next();
		boolean result = user.checkpassword(password);
		if (!result) {
			try {
				throw new InvalidpasswordException();
			} catch (InvalidpasswordException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			System.out.println("Test case pass");
			assertTrue("Happy", result);
		}
	}

	class InvalidpasswordException extends Exception {
		   public void printCause() {
			System.out.println("Invalid Password Exception");
		}	
	}
	
	@Test
	public void givenmobileWhenFalse() throws InvalidmobileException {
		System.out.println("Enter mobile Name");
		String mobile = sc.nextLine();
		boolean result = user.checkmobileno(mobile);
		if (!result) {
			try {
				throw new InvalidmobileException();
			} catch (InvalidmobileException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			System.out.println("Test case pass");
			assertTrue("Happy", result);
		}
	}

	class InvalidmobileException extends Exception {
		   public void printCause() {
			System.out.println("Invalid Mobile number Exception");
		}	
	}
	
}
