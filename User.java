package userValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	
	
	public void checkFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME FOR VALIDATION");
		System.out.println("(It should be in format of 'First name starts with Cap and has minimum 3 characters'");
		String firstname = sc.next();
		String format = "^[A-Z]([a-z]+){2}$";
		Pattern pattern = Pattern.compile(format);
		Matcher firstnamematch = pattern.matcher(firstname);
		if (firstnamematch.matches()) {
			System.out.println("FIRST NAME SUCCESSFULLY MATCH");
		} else
			System.out.println("YOU HAVE ENTER IN WRONG FORMAT");
	}

	
}
