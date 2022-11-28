package userValidation;


import java.util.Scanner;

public class User {

	Scanner sc = new Scanner(System.in);
	UserValidation validator = new UserValidation();

	public void FirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME FOR VALIDATION");
		System.out.println("(It should be in format of 'First name starts with Cap and has minimum 3 characters'");
		String firstname = sc.next();
		boolean result = validator.checkFirstName(firstname);
		if (result) {
			System.out.println("Your first Name is Validate successfully");
		} else
			System.out.println("Unsuccessfull, try again ");
	}

	public void lastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER LAST NAME FOR VALIDATION");
		System.out.println("(It should be in format of 'First name starts with Cap and has minimum 3 characters'");
		String lastname = sc.next();
		boolean result = validator.checklastName(lastname);
		if (result) {
			System.out.println("Your last Name is Validate successfully");
		} else
			System.out.println("Unsuccessfull, try again ");
	}

	public void email() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EMAIL FOR VALIDATION");
		System.out.println("(Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with\r\n"
				+ "precise @ and . positions' E.g. abc.xyz@bl.co.in");
		String email = sc.next();
		boolean result = validator.checkemail(email);
		if (result) {
			System.out.println("Your Email is Validate successfully");
		} else
			System.out.println("Unsuccessfull, try again ");
	}

	public void password() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PASSWORD FOR VALIDATION");
		System.out.println("(It should be in format of 'minimum 8 Characters and Should have at least Upper Case \r\n"
				+ "Should have at least 1 numeric number in the password and has 1 special character '");
		String password = sc.next();
		boolean result = validator.checkpassword(password);
		if (result) {
			System.out.println("Your password is Validate successfully");
		} else
			System.out.println("Unsuccessfull, try again ");
	}

	public void mobileno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER MOBILE NUMBER  FOR VALIDATION");
		System.out.println("(It should be in format of 'Mobile Format - E.g. +919919819801\r\n"
				+ "Country code follow by 10 digit number')");
		String mobile = sc.nextLine();
		boolean result = validator.checkmobileno(mobile);
		if (result) {
			System.out.println("Your mobile number is Validate successfully");
		} else
 	   	System.out.println("Unsuccessfull, try again ");
	}
}
